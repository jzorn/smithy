# Smithy Changelog

## 1.14.1 (2021-11-15)

### Features

* Updated the `@aws.protocols#httpChecksum` trait to use uppercase algorithm names. ([#982](https://github.com/awslabs/smithy/pull/982))

### Bug Fixes

* Fixed an issue where JSON Schema conversion wouldn't remove out-of-service references before deconflicting. ([#978](https://github.com/awslabs/smithy/pull/978))
* Fixed IAM condition key inference not using the `@aws.iam#iamResource` trait. ([#981](https://github.com/awslabs/smithy/pull/981))

## 1.14.0 (2021-11-10)

### Features

* Added the `@aws.protocols#httpChecksum` trait to describe checksumming behavior for operations. ([#972](https://github.com/awslabs/smithy/pull/972))

### Bug Fixes

* Fixed a bug that used a JSON pointer instead of names when generating CloudFormation Resource Schema
  required properties. ([#971](https://github.com/awslabs/smithy/pull/971))

### Documentation

* Clarified parsing of members marked with the `@httpQueryParams` trait. ([#957](https://github.com/awslabs/smithy/pull/957))

## 1.13.1 (2021-11-02)

### Bug Fixes

* Fixed a bug that caused the `apply` transform to not run its projections. ([#969](https://github.com/awslabs/smithy/pull/969))

### Documentation

* Clarified uri label and greedy label documentation. ([#965](https://github.com/awslabs/smithy/pull/965), [#968](https://github.com/awslabs/smithy/pull/968))

## 1.13.0 (2021-10-29)

### Features

* Added a `filterSuppressions` model transform. ([#940](https://github.com/awslabs/smithy/pull/940))
* Updated selector attributes to be stricter. ([#946](https://github.com/awslabs/smithy/pull/946))
* Added support for generating the `required` property when generating CloudFormation Resource Schemas. ([#937](https://github.com/awslabs/smithy/pull/937))
* Added support for generating the `handlers` property when generating CloudFormation Resource Schemas. ([#939](https://github.com/awslabs/smithy/pull/939))
* Added the `@aws.iam#iamResource` trait to indicate properties of a Smithy resource in AWS IAM. ([#948](https://github.com/awslabs/smithy/pull/948))
* Added the `@aws.iam#supportedPrincipleTypes` trait to indicate which IAM principal types can use a service or
  operation. ([#941](https://github.com/awslabs/smithy/pull/941))
* Updated model serializers to allow for serializing the prelude. ([#955](https://github.com/awslabs/smithy/pull/955))
* Updated JSON Schema conversion to maintain property order. ([#932](https://github.com/awslabs/smithy/pull/932))
* Improved `@httpApiKeyAuth` description when converting to OpenAPI. ([#934](https://github.com/awslabs/smithy/pull/934))
* Updated the error message received when http request body content issues are encountered. ([#959](https://github.com/awslabs/smithy/pull/959))
* Updated request tests for `restJson1` query strings. ([#933](https://github.com/awslabs/smithy/pull/933), [#958](https://github.com/awslabs/smithy/pull/958))
* Added protocol tests for `restJson1` content types. ([#924](https://github.com/awslabs/smithy/pull/924), [#945](https://github.com/awslabs/smithy/pull/945))

### Bug Fixes

* Fixed issues in model loading that required a service `version` property. ([#936](https://github.com/awslabs/smithy/pull/936))
* Fixed an issue that where CORS headers in OpenAPI conversions were not case-insensitive. ([#950](https://github.com/awslabs/smithy/pull/950))
* Fixed various issues in protocol tests. ([#930](https://github.com/awslabs/smithy/pull/930), [#933](https://github.com/awslabs/smithy/pull/933),
  [#935](https://github.com/awslabs/smithy/pull/935), [#944](https://github.com/awslabs/smithy/pull/944), [#949](https://github.com/awslabs/smithy/pull/949),
  [#954](https://github.com/awslabs/smithy/pull/954))

### Documentation

* Clarified host-related settings in the `@httpRequestTests` trait documentation. ([#951](https://github.com/awslabs/smithy/pull/951))
* Clarified uri samples and descriptions. ([#960](https://github.com/awslabs/smithy/pull/960))
* Fixed some issues in documentation. ([#952](https://github.com/awslabs/smithy/pull/952))

## 1.12.0 (2021-10-05)

### Features

* Added support for binding common errors to a `service` shape. ([#919](https://github.com/awslabs/smithy/pull/919))
* Loosened the requirement of setting a `version` property when defining a `service`. ([#918](https://github.com/awslabs/smithy/pull/918))
* Updated `smithy-build` to fail when a build plugin cannot be found. ([#909](https://github.com/awslabs/smithy/pull/909))
* Added a `changeTypes` build transform. ([#912](https://github.com/awslabs/smithy/pull/912))
* Added support for replacing simple shapes in `ModelTransformer`. ([#900](https://github.com/awslabs/smithy/pull/900))
* Added a `scheme` property to the `@httpApiKeyAuth` trait. ([#893](https://github.com/awslabs/smithy/pull/893))
* Added support for specifying errors in the `@examples` trait. ([#888](https://github.com/awslabs/smithy/pull/888))
* Added multi-character newline support in `CodeWriter`. ([#892](https://github.com/awslabs/smithy/pull/892))
* Updated semantic validation of modeled `OPTIONS` operations. ([#890](https://github.com/awslabs/smithy/pull/890))
* Added several malformed request protocol tests. ([#879](https://github.com/awslabs/smithy/pull/879), [#882](https://github.com/awslabs/smithy/pull/882),
  [#881](https://github.com/awslabs/smithy/pull/881), [#898](https://github.com/awslabs/smithy/pull/898), [#901](https://github.com/awslabs/smithy/pull/901),
  [#905](https://github.com/awslabs/smithy/pull/905), [#908](https://github.com/awslabs/smithy/pull/908))
* Added protocol tests for path prefixes. ([#899](https://github.com/awslabs/smithy/pull/899))

### Bug Fixes

* Fixed how `NodeMapper` handles generic params. ([#912](https://github.com/awslabs/smithy/pull/912))
* Fixed how the CLI logs messages and interacts with logging levels. ([#910](https://github.com/awslabs/smithy/pull/910))

### Documentation

* Updated guidance on ordering of `set` shapes. ([#875](https://github.com/awslabs/smithy/pull/875))
* Clarify that event streams contain modeled errors. ([#891](https://github.com/awslabs/smithy/pull/891))
* Added an index that lists all traits. ([#876](https://github.com/awslabs/smithy/pull/876))
* Fixed various documentation issues. ([#884](https://github.com/awslabs/smithy/pull/884), [#911](https://github.com/awslabs/smithy/pull/911),
  [#927](https://github.com/awslabs/smithy/pull/927))

## 1.11.0 (2021-08-03)

### Features

* Updated CORS header configuration when converting to OpenAPI while using `sigv4` or `restJson1`. ([#868](https://github.com/awslabs/smithy/pull/868))
* Added the (unstable) `httpMalformedRequestTests` trait to validate service behavior around malformed requests. ([#871](https://github.com/awslabs/smithy/pull/871))
* Added `smithy-diff` error when an enum entry is inserted. ([#873](https://github.com/awslabs/smithy/pull/873))
* Added a `restXml` protocol test. ([#866](https://github.com/awslabs/smithy/pull/866))
* Added a `httpChecksumRequired` protocol test. ([#869](https://github.com/awslabs/smithy/pull/869))

### Bug Fixes

* Updated `NodeMapper` to properly handle `sourceLocation` for traits. ([#865](https://github.com/awslabs/smithy/pull/865))
* Removed warning when an operation using the HTTP `PATCH` method is marked with the `@idempotent` trait. ([#867](https://github.com/awslabs/smithy/pull/867))
* Fixed several issues where a `sourceLocation` wasn't propagated for traits. ([#864](https://github.com/awslabs/smithy/pull/864))

### Documentation

* Fixed various documentation issues. ([#870](https://github.com/awslabs/smithy/pull/870), [#874](https://github.com/awslabs/smithy/pull/874))

## 1.10.0 (2021-07-14)

### Features

* Loosened the requirement of setting an `error` property when configuring `aws.api#clientEndpointDiscovery` trait. ([#850](https://github.com/awslabs/smithy/pull/850))
* Added a `restJson1` protocol test. ([#845](https://github.com/awslabs/smithy/pull/845))
* Added a warning when using the OpenAPI conversion `jsonAdd` setting to alter schemas. ([#851](https://github.com/awslabs/smithy/pull/851))
* Added the `httpChecksum` trait. ([#843](https://github.com/awslabs/smithy/pull/843))

### Bug Fixes

* Revert "Tightened substitution pattern for Fn::Sub to match CloudFormation." ([#858](https://github.com/awslabs/smithy/pull/858))
* Fixed an issue where `cors` trait `additionalExposedHeaders` were not added to gateway responses. ([#852](https://github.com/awslabs/smithy/pull/852))
* Fixed various issues in protocol tests. ([#849](https://github.com/awslabs/smithy/pull/849), [#855](https://github.com/awslabs/smithy/pull/855), [#857](https://github.com/awslabs/smithy/pull/857))

### Documentation

* Clarified behavior for the `aws.api#service` trait's `sdkId` member. ([#848](https://github.com/awslabs/smithy/pull/848))
* Fixed various typos. ([#853](https://github.com/awslabs/smithy/pull/853), [#859](https://github.com/awslabs/smithy/pull/859))

## 1.9.1 (2021-06-28)

### Bug Fixes

* Fixed a number of protocol tests related to non-numeric floats. ([#844](https://github.com/awslabs/smithy/pull/844))
* Tightened substitution pattern for Fn::Sub to match CloudFormation. ([#842](https://github.com/awslabs/smithy/pull/842))

## 1.9.0 (2021-06-23)

### Features

* Added a common validation model for use in server SDKs. ([#813](https://github.com/awslabs/smithy/pull/813))
* Added support for cross platform builds of the CLI. ([#832](https://github.com/awslabs/smithy/pull/832))
* Validate the contents of protocol test bodies for known media types. ([#822](https://github.com/awslabs/smithy/pull/822),
  [#835](https://github.com/awslabs/smithy/pull/835))
* Updated support for non-numeric floating-point values in several places. ([#828](https://github.com/awslabs/smithy/pull/828))
* Added several `restJson` protocol tests. ([#684](https://github.com/awslabs/smithy/pull/684))
* Added several `restXml` protocol tests. ([#804](https://github.com/awslabs/smithy/pull/804))
* Added and updated several `awsQuery` and `ec2Query` protocol tests. ([#815](https://github.com/awslabs/smithy/pull/815),
  [#833](https://github.com/awslabs/smithy/pull/833))
* Added several `document` type protocol tests. ([#810](https://github.com/awslabs/smithy/pull/810))

### Bug Fixes

* Fixed a `NullPointerException` when loading a config and no parent path is present. ([#814](https://github.com/awslabs/smithy/pull/814))

### AWS Customizations

* Added `s3UnwrappedXmlOutput` trait, which defines when an S3 operation does not use the protocol standard XML wrapper.
  ([#839](https://github.com/awslabs/smithy/pull/839))

### Documentation

* Added an overview of known Smithy implementations and projects. ([#830](https://github.com/awslabs/smithy/pull/830), [#831](https://github.com/awslabs/smithy/pull/831))
* Improved the documentation for the `restXml`. ([#827](https://github.com/awslabs/smithy/pull/827))
* Improved the documentation for the `awsQuery`. ([#827](https://github.com/awslabs/smithy/pull/827))
* Improved the documentation for the `ec2Query` protocol. ([#823](https://github.com/awslabs/smithy/pull/823), [#827](https://github.com/awslabs/smithy/pull/827),
  [#836](https://github.com/awslabs/smithy/pull/836))
* Added more context for documentation types. ([#818](https://github.com/awslabs/smithy/pull/818))
* Fixed several minor documentation issues. ([#816](https://github.com/awslabs/smithy/pull/816), [#818](https://github.com/awslabs/smithy/pull/818),
  [#837](https://github.com/awslabs/smithy/pull/837), [#840](https://github.com/awslabs/smithy/pull/840))

## 1.8.0 (2021-05-20)

### Features
* Added `awsQueryError` trait, which defines the value in the `Code` distinguishing field. ([#807](https://github.com/awslabs/smithy/pull/807))
* Added methods to get shapes by type and trait. ([#806](https://github.com/awslabs/smithy/pull/806))
* Improved performance. ([#805](https://github.com/awslabs/smithy/pull/805))
* Improved percent-encoding tests and doumentation. ([#803](https://github.com/awslabs/smithy/pull/803))
* Added `double` format to epoch-seconds timestamps when converting to OpenAPI. ([#802](https://github.com/awslabs/smithy/pull/802))
* Improved CLI output. ([#800](https://github.com/awslabs/smithy/pull/800), [#801](https://github.com/awslabs/smithy/pull/801))

### Bug Fixes
* Fixed awsQuery protocol test to show distinction from ignored `@xmlNamespace` trait. ([#799](https://github.com/awslabs/smithy/pull/799))

## 1.7.2 (2021-05-11)

### Bug Fixes
* Fixed a bug where unions would cause CloudFormation schema conversion to fail. ([#794](https://github.com/awslabs/smithy/pull/794))
* Fixed an incorrect restXml protocol test. ([#795](https://github.com/awslabs/smithy/pull/795))

## 1.7.1 (2021-05-07)

### Features
* Added the `recommended` structure member trait, which indicates that a structure member SHOULD be set. ([#745](https://github.com/awslabs/smithy/pull/745))
* Added support for service renames when using the `flattenNamespaces` transformer. ([#760](https://github.com/awslabs/smithy/pull/760))
* Set `additionalProperties` to `false` for CloudFormation objects. ([#764](https://github.com/awslabs/smithy/pull/764))
* Improved model validation debugging by stopping validation when an `ERROR` occurs while loading models. ([#775](https://github.com/awslabs/smithy/pull/775))
* Added validation warning when a `hostPrefix` contains a label that does not end in a period. ([#779](https://github.com/awslabs/smithy/pull/779))
* Added and updated several `@restXml` protocol test. ([#744](https://github.com/awslabs/smithy/pull/744), [#755](https://github.com/awslabs/smithy/pull/755),
  [#757](https://github.com/awslabs/smithy/pull/757), [#777](https://github.com/awslabs/smithy/pull/777), [#766](https://github.com/awslabs/smithy/pull/781),
  [#789](https://github.com/awslabs/smithy/pull/789))
* Added and updated several `@restJson1` protocol test. ([#747](https://github.com/awslabs/smithy/pull/747), [#755](https://github.com/awslabs/smithy/pull/755),
  [#765](https://github.com/awslabs/smithy/pull/765), [#790](https://github.com/awslabs/smithy/pull/790))

### Bug Fixes
* Fixed number parsing in the IDL, using BigDecimal or BigInteger where needed. ([#766](https://github.com/awslabs/smithy/pull/766))
* Fixed Gradle 7 builds. ([#758](https://github.com/awslabs/smithy/pull/758))
* Added `Document` type to list of inherently boxed shapes. ([#749](https://github.com/awslabs/smithy/pull/749))
* Reordered `TraitService` SPI entries for readability. ([#742](https://github.com/awslabs/smithy/pull/742))

### AWS Customizations
* Added missing `name` properties to `aws.iam#ConditionKeyType` enum. ([#759](https://github.com/awslabs/smithy/pull/759))

### Documentation
* Fixed `selector_expression` and `comment` in ABNF for Smithy IDL. ([#771](https://github.com/awslabs/smithy/pull/771),
  [#771](https://github.com/awslabs/smithy/pull/773))
* Documented conflict resolution of HTTP query params. ([#783](https://github.com/awslabs/smithy/pull/783))
* Documented precedence of constraint traits. ([#784](https://github.com/awslabs/smithy/pull/784))

### Other
* Upgraded to use version `0.5.3` of the [Smithy Gradle Plugin](https://github.com/awslabs/smithy-gradle-plugin). ([#791](https://github.com/awslabs/smithy/pull/791))

## 1.7.0 (2021-03-12)

### Features

* Added the `rename` property to the `service` shape to disambiguate shape name conflicts in the service closure. ([#734](https://github.com/awslabs/smithy/pull/734))
* Added the `httpQueryParams` trait that binds a map of key-value pairs to query string parameters. ([#735](https://github.com/awslabs/smithy/pull/735))
* Improved the usability of code for building and running Selectors. ([#726](https://github.com/awslabs/smithy/pull/726))
* Added several protocol tests for behavior around `null` serialization. ([#728](https://github.com/awslabs/smithy/pull/728))

### Documentation

* Added missing documentation for some trait models. ([#737](https://github.com/awslabs/smithy/pull/737))
* Fixed `awsQuery` and `ec2Query` list serialization examples. ([#732](https://github.com/awslabs/smithy/pull/732))

## 1.6.1 (2021-02-23)

### Features

* Added the `renameShapes` build transform to rename shapes within a model. ([#721](https://github.com/awslabs/smithy/pull/721))

### Bug Fixes

* Fixed several issues in protocol tests around `@endpoint`. ([#720](https://github.com/awslabs/smithy/pull/720))

## 1.6.0 (2021-02-22)

### Features

* Added support for checking backwards compatibility for diffs of trait contents. ([#716](https://github.com/awslabs/smithy/pull/716))
* Added support for adding CORS configurations to API Gateway HTTP APIs. ([#670](https://github.com/awslabs/smithy/pull/670))
* Relaxed constraints on the `@httpPayload` trait, allowing it to target `list`, `set`, and `map` shapes. ([#679](https://github.com/awslabs/smithy/pull/679))
  * Targeting these shapes is invalid for operations utilizing the `aws.protocols` traits. ([#679](https://github.com/awslabs/smithy/pull/679),
    [#683](https://github.com/awslabs/smithy/pull/683))
* Added validation to ensure a `payloadFormatVersion` is set when generating an API Gateway HTTP API. ([#688](https://github.com/awslabs/smithy/pull/688))
* Added `vendorParamsShape` to protocol test cases to support validating a test case's `vendorParams` values are
  configured properly. ([#702](https://github.com/awslabs/smithy/pull/702))
* Added the ability to validate resolved hosts to protocol tests. ([#707](https://github.com/awslabs/smithy/pull/707))
* Added backwards compatibility checking to `smithy-diff` for the `@paginated` trait. ([#716](https://github.com/awslabs/smithy/pull/716))
* Added `tags` and `appliesTo` to protocol test definitions for better categorization and grouping. ([#696](https://github.com/awslabs/smithy/pull/696))
* Added several protocol tests for the `endpoint` and `hostLabel` traits. ([#708](https://github.com/awslabs/smithy/pull/708))
* Added several `@restXml` protocol tests. ([#689](https://github.com/awslabs/smithy/pull/689), [#690](https://github.com/awslabs/smithy/pull/690),
  [#678](https://github.com/awslabs/smithy/pull/678), [#694](https://github.com/awslabs/smithy/pull/694))

### Bug Fixes

* Fixed an issue that produced duplicate entries in the `security` list of a converted OpenAPI document. ([#687](https://github.com/awslabs/smithy/pull/687))
* Fixed an issue where `alphanumericOnlyRefs` was not fully satisfied when generating synthesized shapes. ([#695](https://github.com/awslabs/smithy/pull/695))
* Fixed several issues in IDL parsing where duplicate bindings were allowed incorrectly. ([#714](https://github.com/awslabs/smithy/pull/714))
* Fixed several issues in protocol tests around serialization of empty contents. ([#692](https://github.com/awslabs/smithy/pull/692))
* Fixed an issue where parameters in a diff error message were swapped. ([#713](https://github.com/awslabs/smithy/pull/713))
* Fixed an issue in a `restXml` protocol test. ([#715](https://github.com/awslabs/smithy/pull/715))

### AWS Customizations

* Added a configuration definition for use validating `vendorParams` in AWS protocol tests. ([#705](https://github.com/awslabs/smithy/pull/705))
* Added tests and documentation for some required Amazon S3 customizations. ([#709](https://github.com/awslabs/smithy/pull/709))
* Added tests and documentation for required Amazon Glacier customizations. ([#704](https://github.com/awslabs/smithy/pull/704))
* Added a test and documentation for the required Amazon API Gateway customization. ([#706](https://github.com/awslabs/smithy/pull/706))
* Added a test and documentation for the required Amazon Machine Learning customization. ([#707](https://github.com/awslabs/smithy/pull/707)) 

### Documentation

* Improved the documentation for the `awsJson1_0` and `awsJson1_1` protocols. ([#698](https://github.com/awslabs/smithy/pull/698))
* Improved the documentation for the `awsQuery` and `ec2Query` protocols. ([#700](https://github.com/awslabs/smithy/pull/700))
* Clarified that Smithy requires support for fractional seconds for the `http-date` value of `@timestampFormat`. ([#672](https://github.com/awslabs/smithy/pull/672))
* Added missing shape documentation for some waiters related shapes. ([#711](https://github.com/awslabs/smithy/pull/711))
* Fixed several minor documentation issues. ([#681](https://github.com/awslabs/smithy/pull/681), [#693](https://github.com/awslabs/smithy/pull/693),
  [#697](https://github.com/awslabs/smithy/pull/697), [#701](https://github.com/awslabs/smithy/pull/701), [#708](https://github.com/awslabs/smithy/pull/708),
  [#717](https://github.com/awslabs/smithy/pull/717))

### Other

* Migrated to using Gradle 6 to build Smithy. This should have no impactful downstream effects. ([#194](https://github.com/awslabs/smithy/pull/194))
* Migrated to using `main` from `master` for the default branch. This should have no impactful downstream effects. ([#685](https://github.com/awslabs/smithy/pull/685))

## 1.5.1 (2020-12-21)

### Bug Fixes

* Fixed several issues related to building and running on Windows. ([#671](https://github.com/awslabs/smithy/pull/671))
* Fixed an issue loading the `jsonAdd` map from configuration for the `cloudformation` plugin. ([#673](https://github.com/awslabs/smithy/pull/673))
* Fixed an issue where API Gateway REST APIs would have greedy label parameter names rendered into OpenAPI with
  a `+` suffix. ([#674](https://github.com/awslabs/smithy/pull/674))

## 1.5.0 (2020-12-10)

### Features

* Added the `endpointPrefix` property to the `@aws.api#service` trait. ([#663](https://github.com/awslabs/smithy/pull/663))
* Added support for `tags` and `deprecated` members to `@waitable` definitions. ([#652](https://github.com/awslabs/smithy/pull/652))
* Added validation for `@httpHeader` trait values. ([#650](https://github.com/awslabs/smithy/pull/650))
* Add `required` property for `requestBody` when converting to OpenAPI. ([#655](https://github.com/awslabs/smithy/pull/655))
* Added more helper methods to `OperationIndex`. ([#657](https://github.com/awslabs/smithy/pull/657))

### Bug Fixes

* Ensure that names in the `@waitable` trait are unique in the closure of the service. ([#645](https://github.com/awslabs/smithy/pull/645))
* Fixed a regression with `@aws.apigateway#authorizors` behavior when setting the `customAuthType` property without
  having set its `type` property. ([#613](https://github.com/awslabs/smithy/pull/613))
* Fixed an issue where modeled headers were not populated in to `Access-Control-Expose-Headers` in CORS responses.
  ([#659](https://github.com/awslabs/smithy/pull/659))
* Added missing `deprecated` member to `@enum` definitions in the prelude model. ([#651](https://github.com/awslabs/smithy/pull/651))
* Fixed an issue with the conversion of greedy label parameter names in to OpenAPI. ([#641](https://github.com/awslabs/smithy/pull/641))
* Fixed an issue in `CodeWriter.popState` where it would not honor custom expression start characters. ([#648](https://github.com/awslabs/smithy/pull/648))
* Fixed a potential `NullPointerException` when validating the `@examples` trait. ([#642](https://github.com/awslabs/smithy/pull/642))
* Fixed issues with some `@awsQuery` and `@ec2Query` protocol test responses. ([#653](https://github.com/awslabs/smithy/pull/653))
* Fixed an issue where the `removeTraitDefinitions` build transform was not registered with the SPI. ([#660](https://github.com/awslabs/smithy/pull/660))
* Fixed an issue where using an environment variable in `smithy-build.json` would consume an extra preceding
  character when performing a replacement. ([#662](https://github.com/awslabs/smithy/pull/662)) 

### Documentation

* Update `@waitable` documentation to specify using jitter and account for overflows. ([#656](https://github.com/awslabs/smithy/pull/656))
* Added examples and clarified documentation for several HTTP traits, most importantly `@httpLabel` and `@httpQuery`.
  ([#654](https://github.com/awslabs/smithy/pull/654))
* Clarified various aspects of the `@xmlNamespace` trait documentation. ([#643](https://github.com/awslabs/smithy/pull/643))
* Clarified `@waitable` documentation. ([#646](https://github.com/awslabs/smithy/pull/646), [#664](https://github.com/awslabs/smithy/pull/664))
* Clarified that the `@pattern` trait does not implicitly match an entire string. ([#649](https://github.com/awslabs/smithy/pull/649))
* Fixed various examples in the specification. ([#639](https://github.com/awslabs/smithy/pull/639))

### Cleanup

* Sort `TopDownIndex` contents to provide deterministic results. ([#667](https://github.com/awslabs/smithy/pull/667))
* Improved error messages when an unknown annotation trait is encountered. ([#644](https://github.com/awslabs/smithy/pull/644))
* Added `smithy-diff` error when the `@idempotencyTrait` token is removed from a shape. ([#640](https://github.com/awslabs/smithy/pull/640))

## 1.4.0 (2020-11-20)

### Features

#### New Packages

* Added `smithy-jmespath`, a dependency-less, JMESPath parser with a rich AST that can be used in code generation, and
  performs static analysis of expressions. ([#621](https://github.com/awslabs/smithy/pull/621))
* Added `smithy-waiters`, containing the `@waitable` trait. This provides information that clients can use to poll
  until a desired state is reached, or it is determined that that state cannot be reached. ([#623](https://github.com/awslabs/smithy/pull/623))
* Added `smithy-aws-cloudformation-traits`, containing several (unstable) traits that indicate CloudFormation resources
  and the additional metadata about their properties. ([#579](https://github.com/awslabs/smithy/pull/579))
* Added `smithy-aws-cloudformation`, containing the (unstable) "cloudformation" build tool that, given a model
  decorated with traits from `aws.cloudformation`, will generate CloudFormation Resource Schemas. ([#622](https://github.com/awslabs/smithy/pull/622))

#### Other Features

* Added support for `patternProperties` when generating JSON Schema. ([#611](https://github.com/awslabs/smithy/pull/611))
* Added more utility methods to the `CodeWriter`. ([#624](https://github.com/awslabs/smithy/pull/624))
* Added validation for `@sensitive` trait when applied to members. ([#609](https://github.com/awslabs/smithy/pull/609))
* Added support for retrieving full paths to the `outputToken` and `items` pagination members. ([#628](https://github.com/awslabs/smithy/pull/628))
* Added a warning for `@enum` entries without names. ([#610](https://github.com/awslabs/smithy/pull/610))
* Added support for generating an `integer` OpenAPI type. ([#632](https://github.com/awslabs/smithy/pull/632))
* Improved `smithy-diff` evaluation of changing member targets. ([#630](https://github.com/awslabs/smithy/pull/630))
* Updated pagination tokens to support being `map` shapes. ([#629](https://github.com/awslabs/smithy/pull/629))

### Bug Fixes

* Fixed a bug where URIs would be declared conflicting if the differed through the `@endpoint` trait. ([#626](https://github.com/awslabs/smithy/pull/626))
* Fixed a bug that would allow the `@aws.auth#sigv4` trait's `name` property to be empty. ([#635](https://github.com/awslabs/smithy/pull/635))
* Updated protocol tests for `@sparse` trait. ([#620](https://github.com/awslabs/smithy/pull/620), [#631](https://github.com/awslabs/smithy/pull/631))
* Fixed a bug with the interaction of `CodeWriter.writeInline` with sections. ([#617](https://github.com/awslabs/smithy/pull/617))

### Documentation

* Fixed links for protocol test suites. ([#615](https://github.com/awslabs/smithy/pull/615))
* Added example and test for composing with `CodeWriter`. ([#619](https://github.com/awslabs/smithy/pull/619))
* Clarified that `@enum` values cannot be empty. ([#633](https://github.com/awslabs/smithy/pull/633))
* Clarified binary data in protocol tests. ([#634](https://github.com/awslabs/smithy/pull/634))

### Cleanup

* Lowered severity of validation that a `pageSize` member is marked `@required`. ([#612](https://github.com/awslabs/smithy/pull/612))

## 1.3.0 (2020-10-20)

### Features

* Added several `CodegenWriter` and related abstractions to simplify creating code generators. ([#587](https://github.com/awslabs/smithy/pull/587))
* Added the `@sparse` trait to the Prelude. ([#599](https://github.com/awslabs/smithy/pull/599))
* Added the `NullableIndex` to help check if a shape can be set to null. ([#599](https://github.com/awslabs/smithy/pull/599))
* Added support for API Gateway API key usage plans. ([#603](https://github.com/awslabs/smithy/pull/603), [#605](https://github.com/awslabs/smithy/pull/605))
* Added the `sortMembers` model transform to reorder the members of structures and unions. ([#588](https://github.com/awslabs/smithy/pull/588))
* Add `description` property to operations when converting to OpenAPI. ([#589](https://github.com/awslabs/smithy/pull/589))

### Bug Fixes

* Fixed an issue where the `flattenNamespaces` build transform was not registered with the SPI. ([#593](https://github.com/awslabs/smithy/pull/593))

### Optimizations

* Optimized the reverse `NeighborProvider` for memory usage. ([#590](https://github.com/awslabs/smithy/pull/590))
* Optimized model validation event aggregation for memory usage. ([#595](https://github.com/awslabs/smithy/pull/595))

### Documentation

* Clarified that `map` keys, `set` values, and `union` members cannot be null. ([#596](https://github.com/awslabs/smithy/pull/596/))
* Clarified `enum` names and their usage. ([#601](https://github.com/awslabs/smithy/pull/601))
* Added an example dependency to OpenAPI conversion. ([#594](https://github.com/awslabs/smithy/pull/594))
* Improve and clean up formatting. ([#585](https://github.com/awslabs/smithy/pull/585), [#597](https://github.com/awslabs/smithy/pull/597),
  [#598](https://github.com/awslabs/smithy/pull/598))

### Cleanup

* Updated `service`, `resource`, and `operation` shapes to maintain the order of bound `resource` and `operation`
  shapes. ([#602](https://github.com/awslabs/smithy/pull/602))
* Updated the `sources` build plugin to create an empty manifest if there are no source models. ([#607](https://github.com/awslabs/smithy/pull/607))
* Deprecated the `BoxIndex`. ([#599](https://github.com/awslabs/smithy/pull/599))
* Added `enum` names for `httpApiKeyLocation` in the Prelude. ([#606](https://github.com/awslabs/smithy/pull/606))

## 1.2.0 (2020-09-30)

### Features

* Added information to the `ModelDiff.Result` indicating how events have changed between the diff'd models. ([#574](https://github.com/awslabs/smithy/pull/574))
* Added a media type parser and validation for the `@mediaType` trait. ([#582](https://github.com/awslabs/smithy/pull/582))
* Added additional default CORS headers and configuration for OpenAPI conversions. ([#583](https://github.com/awslabs/smithy/pull/583))
* Added the `flattenNamespaces` build transform to flatten the namespaces of shapes connected to a specified service
  in a model in to a target namespace. ([#572](https://github.com/awslabs/smithy/pull/572))
* Added `runCommand` functionality to `smithy-utils`. ([#580](https://github.com/awslabs/smithy/pull/580))
* Added a `TriConsumer` to `smithy-utils`. ([#581](https://github.com/awslabs/smithy/pull/581))
* Added support for the `@httpResponseCode` trait in the `HttpBindingIndex`. ([#571](https://github.com/awslabs/smithy/pull/571))
* Added protocol tests for the `@httpResponseCode` trait. ([#573](https://github.com/awslabs/smithy/pull/573))

### Bug Fixes

* Fixed several issues that would cause Smithy to fail when running on Windows. ([#575](https://github.com/awslabs/smithy/pull/575),
  [#576](https://github.com/awslabs/smithy/pull/576), [#577](https://github.com/awslabs/smithy/pull/577))
* Fixed a bug where a `union` shape marked as an `@httpPayload` would throw an exception when trying to resolve
  its content-type. ([#584](https://github.com/awslabs/smithy/pull/584))
* Fixed a bug in OpenAPI conversions where tags were not passed through unless set in the `supportedTags` list, even
  when the `tags` setting was enabled. ([#570](https://github.com/awslabs/smithy/pull/570))

## 1.1.0 (2020-09-16)

### Features

* Added the `removeTraitDefinitions` build transform to remove trait definitions from models but leave instances intact.
  ([#558](https://github.com/awslabs/smithy/pull/558))
* Added payload binding validation to HTTP `DELETE` operations. ([#566](https://github.com/awslabs/smithy/pull/566))
* Updated `SmithyDiff` to emit events when traits are changed. ([#561](https://github.com/awslabs/smithy/pull/561))

### Bug Fixes

* Fixed an issue where some `StringListTrait` instances could lose `SourceLocation` information. ([#564](https://github.com/awslabs/smithy/pull/564))
* Fixed some issues in protocol tests. ([#560](https://github.com/awslabs/smithy/pull/560), [#563](https://github.com/awslabs/smithy/pull/563))

### Cleanup

* Model components are now deduplicated based on location and value. ([#565](https://github.com/awslabs/smithy/pull/565))
* Normalize URL import filenames for better deduplication and reporting. ([#562](https://github.com/awslabs/smithy/pull/562))

## 1.0.11 (2020-09-10)

### Features

* Added a reverse-topological knowledge index to aid in code generation for languages that require types to be
  defined before they are referenced. ([#545](https://github.com/awslabs/smithy/pull/545), [#53](https://github.com/awslabs/smithy/pull/553))
* Added the `@httpResponseCode` trait to indicate that a structure member represents an HTTP response status code. ([#546](https://github.com/awslabs/smithy/pull/546))
* Added (unstable) support for generating a "Trace File" to link code generated artifacts back to their modeled source.
  ([#552](https://github.com/awslabs/smithy/pull/552))
* Added the `:topdown` selector that matches shapes hierarchically. ([#539](https://github.com/awslabs/smithy/pull/539))
* Added validation for the `cloudTrailEventSource` property of the `@aws.api#service` trait. ([#550](https://github.com/awslabs/smithy/pull/550))
* Updated shape builders to properly update their member ShapeIds if the ShapeId of the builder changes. ([#556](https://github.com/awslabs/smithy/pull/556))
* Added several more XML related protocol tests. ([#547](https://github.com/awslabs/smithy/pull/547))

### Bug Fixes

* Fixed a bug where the `PaginatedIndex` did not properly support resolving paths. ([#554](https://github.com/awslabs/smithy/pull/554))

### Documentation

* Clarified the documentation for the `cloudTrailEventSource` property of the `@aws.api#service` trait. ([#550](https://github.com/awslabs/smithy/pull/550))
* Clarified that the `@aws.api#arn` trait has no impact on OpenAPI conversions. ([#555](https://github.com/awslabs/smithy/pull/555))

## 1.0.10 (2020-08-26)

### Features

* Added a validation event when a syntactic shape ID is found that does not target an actual shape in the model.
  ([#542](https://github.com/awslabs/smithy/pull/542))

### Bug Fixes

* Fixed a bug where forward reference resolution would use the incorrect namespace when resolving operation and
  resource bindings. ([#543](https://github.com/awslabs/smithy/pull/543))

### Cleanup

* Deprecated the reflection-based creation pattern for `KnowledgeIndex` implementations. ([#541](https://github.com/awslabs/smithy/pull/541))

## 1.0.9 (2020-08-21)

### Features

* Allow conflicting shape definitions if the fully built shapes are equivalent. ([#520](https://github.com/awslabs/smithy/pull/520))
* Added the `@internal` trait to the prelude. ([#531](https://github.com/awslabs/smithy/pull/531))
* Added the `excludeShapesByTrait` build transform that will remove any shapes marked with one or more of the
  specified traits. ([#531](https://github.com/awslabs/smithy/pull/531))
* Improved support for newlines and indentation in `CodeWriter`. ([#529](https://github.com/awslabs/smithy/pull/529))
* Added support for configuring the expression starting character in `CodeWriter`. ([#529](https://github.com/awslabs/smithy/pull/529))
* Added `payloadFormatVersion` property for API Gateway integrations. ([#527](https://github.com/awslabs/smithy/pull/527))
* Add `deprecated` property to operations when converting to OpenAPI. ([#535](https://github.com/awslabs/smithy/pull/535))
* Added several more protocol tests. ([#528](https://github.com/awslabs/smithy/pull/528), [#536](https://github.com/awslabs/smithy/pull/536)) 

### Bug Fixes

* Fixed the selector for the `@httpQuery` trait. ([#534](https://github.com/awslabs/smithy/pull/534))
* Fixed the selector for the `@httpPrefixHeaders` trait. ([#533](https://github.com/awslabs/smithy/pull/533))
* Fixed some issues in protocol tests. ([#526](https://github.com/awslabs/smithy/pull/526))

### Cleanup

* Removed the `abbreviation` property from the `@aws.api#service` trait. ([#532](https://github.com/awslabs/smithy/pull/532))
* Simplified prelude model loading. ([#524](https://github.com/awslabs/smithy/pull/524))
* Further simplified overall model loading. ([#525](https://github.com/awslabs/smithy/pull/525))

## 1.0.8 (2020-07-31)

### Features

* Updated `Walker` to provide a stable sort for shapes. ([#511](https://github.com/awslabs/smithy/pull/511))
* Improved support for loading `ValidationEvent`s via `NodeMapper`. ([#518](https://github.com/awslabs/smithy/pull/518),
  [#516](https://github.com/awslabs/smithy/pull/516))
* Added the ability to `disableFromNode` via `NodeMapper`. ([#505](https://github.com/awslabs/smithy/pull/505))

### Bug Fixes

* Fixed several issues in protocol tests. ([#502](https://github.com/awslabs/smithy/pull/502), [#507](https://github.com/awslabs/smithy/pull/507))

### Cleanup

* Stopped raising validation errors and running validation with `RenameShapes` transformer. ([#512](https://github.com/awslabs/smithy/pull/512))
* Simplified conflict handling for shapes. ([#514](https://github.com/awslabs/smithy/pull/514))
* Simplified duplicate member detection and handling. ([#513](https://github.com/awslabs/smithy/pull/513))

## 1.0.7 (2020-07-16)

### Features

* Use the `@title` trait to improve generated documentation for JSON Schema unions that use `"oneOf"`. ([#485](https://github.com/awslabs/smithy/pull/485))
* Added and updated several protocol tests for `restJson1`. ([#490](https://github.com/awslabs/smithy/pull/490))
* Added and updated several protocol tests for `awsJson1_1`. ([#484](https://github.com/awslabs/smithy/pull/484), [#493](https://github.com/awslabs/smithy/pull/493))
* Added protocol tests for `awsJson1_0`. ([#496](https://github.com/awslabs/smithy/pull/496))

### Bug Fixes

* Fixed a bug where `passthroughBehavior` was misspelled as `passThroughBehavior`
  in APIGateway OpenAPI output for integrations and mock integrations. ([#495](https://github.com/awslabs/smithy/pull/495))
* Fixed a bug where only the last line in a multiline doc comment on a
  member would be successfully parsed. ([#498](https://github.com/awslabs/smithy/pull/498))
* Fixed several issues in protocol tests. ([#473](https://github.com/awslabs/smithy/pull/473), [#476](https://github.com/awslabs/smithy/pull/476),
  [#481](https://github.com/awslabs/smithy/pull/481), [#491](https://github.com/awslabs/smithy/pull/491))

### Documentation

* Refactored the specification to better explain the semantic model and its representations. ([#497](https://github.com/awslabs/smithy/pull/497),
  [#482](https://github.com/awslabs/smithy/pull/482))
* Clarified guidance on using `@mediaType`. ([#500](https://github.com/awslabs/smithy/pull/500))
* Removed outdated namespace guidance. ([#487](https://github.com/awslabs/smithy/pull/487))
* Fixed several minor issues. ([#494](https://github.com/awslabs/smithy/pull/494))

### Cleanup

* Disallowed problematic identifiers misusing `_`. ([#499](https://github.com/awslabs/smithy/pull/499))
* Moved validation of members with the `@httpLabel` trait being marked required to the selector. ([#480](https://github.com/awslabs/smithy/pull/480))

## 1.0.6 (2020-06-24)

### Features

* Update `structure` and `union` shapes so member order is maintained as part of the contract. ([#465](https://github.com/awslabs/smithy/pull/465))
* Add validation for `document` types in protocols. ([#474](https://github.com/awslabs/smithy/pull/474))
* Provide suggestions for invalid Shape ID targets if a close match is found. ([#466](https://github.com/awslabs/smithy/pull/466))
* Added message templates and trait binding to the `EmitEachSelector`. ([#467](https://github.com/awslabs/smithy/pull/467))
* Added ability to add traits directly to the `ModelAssembler`. ([#470](https://github.com/awslabs/smithy/pull/470))
* Convert `awsJson1_1` protocol tests to Smithy IDL. ([#472](https://github.com/awslabs/smithy/pull/472))
* Update decimal values in protocol tests. ([#471](https://github.com/awslabs/smithy/pull/471)) 

### Documentation

* Update quick start guide with more examples. ([#462](https://github.com/awslabs/smithy/pull/462))

### Bug Fixes

* Fixed issues allowing `document` types in `@httpHeader` and `@httpPrefixHeaders` traits. ([#474](https://github.com/awslabs/smithy/pull/474))

## 1.0.5 (2020-06-05)

### Bug Fixes

* Fixed a bug in loading IDL files where resolving a forward reference that needed another
  forward reference would throw an exception. ([#458](https://github.com/awslabs/smithy/pull/458))
* Fixed a bug where smithy-build imports were not resolved relative to their `smithy-build.json`. ([#457](https://github.com/awslabs/smithy/pull/457))  
* Fixed a bug where the `PREFIX_HEADERS` HTTP binding location would not default its timestamp
  format to `HTTP_DATE`. ([#456](https://github.com/awslabs/smithy/pull/456))

## 1.0.4 (2020-05-29)

### Features

* Ensure that when a property is removed from a JSON schema object, that a corresponding "required"
  entry is also removed. ([#452](https://github.com/awslabs/smithy/pull/452))
* Added the (unstable) `@httpChecksumRequired` trait to indicate an operation requires a checksum
  in its HTTP request. ([#433](https://github.com/awslabs/smithy/pull/433), [#453](https://github.com/awslabs/smithy/pull/453))

### Bug Fixes

* Fixed a bug in OpenApi conversion where removing authentication for an operation would result
  in the operation inheriting the global "security" configuration instead of having it set to none. ([#451](https://github.com/awslabs/smithy/pull/451/))

### Documentation

* Added examples of building models to various guides. ([#449](https://github.com/awslabs/smithy/pull/449))
* Fixed various documentation issues. ([#449](https://github.com/awslabs/smithy/pull/449))

## 1.0.3 (2020-05-26)

### Bug Fixes

* Prevent parsing overly deep Node values ([#442](https://github.com/awslabs/smithy/pull/442))
* Fix an issue with the OpenAPI conversion where synthesized structure inputs reference required properties that
  were removed. ([#443](https://github.com/awslabs/smithy/pull/443))

## 1.0.2 (2020-05-18)

### Bug Fixes

* Fix an issue that would squash exceptions thrown for invalid suppressions. ([#440](https://github.com/awslabs/smithy/pull/440))

## 1.0.1 (2020-05-13)

### Features

* The `smithy.api#httpPayload` trait can now target document shapes. ([#431](https://github.com/awslabs/smithy/pull/431))
* Updated the IDL grammar to include many previously enforced parsing rules. ([#434](https://github.com/awslabs/smithy/pull/434))
* Added the `select` command to the CLI to print out shapes from a model that match a selector. ([#430](https://github.com/awslabs/smithy/pull/430))
* Added the `ast` command to the CLI to convert 0 or more Smithy models into a JSON AST. ([#435](https://github.com/awslabs/smithy/pull/435))
* Added a Dockerfile for building Smithy as a Docker image. ([#427](https://github.com/awslabs/smithy/pull/427))

### Optimizations

* The Smithy IDL parser has been rewritten and optimized. ([#434](https://github.com/awslabs/smithy/pull/434))
* Generate a class data share to speed up the CLI. ([#429](https://github.com/awslabs/smithy/pull/429))

### Bug Fixes

* Fix several ambiguities and issues in the IDL grammar. ([#434](https://github.com/awslabs/smithy/pull/434))
* JSON pretty printing of the AST now uses 4 spaces for indentation. ([#435](https://github.com/awslabs/smithy/pull/435))
* Fix CLI `--help` output alignment. ([#429](https://github.com/awslabs/smithy/pull/429))

## 1.0.0 (2020-05-04)

***Note***: Changes marked with "[BC]" are breaking changes more accurately described in the
specific section. A list of further intended breaking changes have a specific section near
the end of this entry.

### Features

#### General

* The model format version has been updated to `1.0` and contains several updates: [BC] ([#357](https://github.com/awslabs/smithy/pull/357),
  [#381](https://github.com/awslabs/smithy/pull/381))
  * The JSON AST representation requires describing annotation traits as `{}` instead of `true`.
  * Annotation traits in the IDL are now provided as `@foo` or `@foo()`. Explicit `@foo(true)` and
  `@foo(null)` support was removed.
* Smithy models can now be serialized to the IDL. ([#284](https://github.com/awslabs/smithy/pull/284))
* Added a Node-based object mapper to simplify the process of building and using Java components
from Smithy `Node`s. ([#301](https://github.com/awslabs/smithy/pull/301))
  * Many packages have seen significant updates to use this functionality. ([#305](https://github.com/awslabs/smithy/pull/305),
    [#364](https://github.com/awslabs/smithy/pull/364))
* Made error messages clearer when encountering duplicate shapes. ([#324](https://github.com/awslabs/smithy/pull/324))
* Model loaders now warn on additional shape properties instead of fail. ([#374](https://github.com/awslabs/smithy/pull/374))
* Added expect* methods to the base `Shape`. ([#314](https://github.com/awslabs/smithy/pull/314))
* Added `@SmithyUnstableApi`, `@SmithyInternalApi` and `@SmithyGenerated` Java annotations. ([#297](https://github.com/awslabs/smithy/pull/297))
* `NodeValidationVisitor`s are marked as internal and/or unstable. ([#375](https://github.com/awslabs/smithy/pull/375))
* The `$version` control statement can now be set to only a major version (e.g., "1") to indicate that an
  implementation must support a version >= 1 and < 2. `$version` can now be set to `major.minor` (e.g., "1.1")
  to indicate that an implementation must support a version >= 1.1 and < 2.

#### Trait updates

* Individual protocols are now defined as individual traits that are annotated with
[the `protocolDefinition` trait.](https://awslabs.github.io/smithy/1.0/spec/core/protocol-traits.html#protocoldefinition-trait) [BC]
  ([#273](https://github.com/awslabs/smithy/pull/273), [#280](https://github.com/awslabs/smithy/pull/280), [#379](https://github.com/awslabs/smithy/pull/379),
    [#390](https://github.com/awslabs/smithy/pull/390))
  * Previously listed [AWS protocols now have trait implementations.](https://awslabs.github.io/smithy/1.0/spec/aws/index.html#aws-protocols)
* Individual authentication schemes are now defined as individual traits that are annotated with
[the `authDefinition` trait.](https://awslabs.github.io/smithy/1.0/spec/core/auth-traits.html#authdefinition-trait) [BC]
  ([#273](https://github.com/awslabs/smithy/pull/273), [#280](https://github.com/awslabs/smithy/pull/280))
  * Previously listed [authentication schemes now have trait implementations.](https://awslabs.github.io/smithy/1.0/spec/core/auth-traits.html)
* The `smithy.api#enum` trait is now a list of enum definitions instead of a map of string keys to
enum definitions to improve clarity and encourage adding more properties to definitions. [BC] ([#326](https://github.com/awslabs/smithy/pull/326))
* The `aws.api#streaming` trait is now applied to shapes directly instead of members. [BC] ([#340](https://github.com/awslabs/smithy/pull/340))
* The `smithy.api#eventStream` trait has been removed. Event streams are now indicated by applying
the `smithy.api#streaming` trait to unions. [BC] ([#365](https://github.com/awslabs/smithy/pull/365))
* The `smithy.api#requiresLength` trait has been split out of the `smithy.api#streaming` trait to
improve clarity around event stream modeling. [BC] ([#368](https://github.com/awslabs/smithy/pull/368))
* The `smithy.api#externalDocumentation` trait is now a map instead of a single string to allow for
multiple links per trait. [BC] ([#363](https://github.com/awslabs/smithy/pull/363))
* Added the `smithy.api#noReplace` trait to indicate a PUT lifecycle operation cannot replace the
existing resource. ([#351](https://github.com/awslabs/smithy/pull/351))
* Added the `smithy.api#unstable` trait to indicate a shape MAY change. ([#290](https://github.com/awslabs/smithy/pull/290))
* Simplified `aws.api#unsignedPayload` to be an annotation. [BC] ([#270](https://github.com/awslabs/smithy/pull/270))
* Annotation traits are now lossless when loaded with additional properties, meaning they will
contain those properties when serialized. ([#385](https://github.com/awslabs/smithy/pull/385))

#### Selector updates

Selectors have received significant updates: ([#388](https://github.com/awslabs/smithy/pull/388))

* Attribute selectors can now evaluate scoped comparisons using `@foo:` to define a scope
and `@{bar}` to define a context value. ([#391](https://github.com/awslabs/smithy/pull/391))
* And logic, via `&&`, has been added to allow multiple attribute comparisons. ([#391](https://github.com/awslabs/smithy/pull/391))
* Support for selecting nested trait properties with `|`, including list/object values and object
keys, was added.
* An opt-in `trait` relationship has been added. ([#384](https://github.com/awslabs/smithy/pull/384))
* The recursive neighbor selector, `~>`, has been added. ([#386](https://github.com/awslabs/smithy/pull/386))
* A not equal comparison, `!=`, was added.
* An exists comparison, `?=`, was added. ([#391](https://github.com/awslabs/smithy/pull/391))
* Support for numbers in attribute selectors was added.
* Numeric comparisons (`>`, `>=`, `<`, `<=`) were added.
* The `(length)` function property was added. ([#391](https://github.com/awslabs/smithy/pull/391))
* Attribute selectors now support CSV values, allowing matching on one or more target values.
* The `:each` selector is now `:is` for clarity. [BC]
* The `:of` selector is now removed. Use reverse neighbors instead (e.g., `member :test(< structure)`). [BC]
* The semantics of the `:not` selector have changed significantly. `:not(list > member > string)` now means
  "do not match list shapes that target strings", whereas this previously meant,
  "do not match string shapes targeted by lists". [BC]
* Shape IDs with members must now be quoted. [BC]
* Selector parsing and evaluating now tolerates unknown relationship types. ([#377](https://github.com/awslabs/smithy/pull/377))

#### Validation updates

* Services must now contain a closure of shapes that have case-insensitively unique names. [BC] ([#337](https://github.com/awslabs/smithy/pull/337))
* `suppressions` has been updated to now only suppress validation events that occur for an entire namespace or across
  the entire model. The `@suppress` trait was added to suppress validation events for a specific shape. [BC] ([#397](https://github.com/awslabs/smithy/pull/397)).
* The `UnreferencedShape` validator has moved to `smithy-model` and is now always run. [BC] ([#319](https://github.com/awslabs/smithy/pull/319))
* `EmitEachSelector` and `EmitNoneSelector` were moved from `smithy-linters` into `smithy-model`.

#### JSON Schema conversion

The conversion to JSON schema was significantly overhauled. [BC] ([#274](https://github.com/awslabs/smithy/pull/274))

* Configuration for the build plugin was significantly overhauled. [BC] ([#364](https://github.com/awslabs/smithy/pull/364))
* The strategy for shape inlining has been changed. [BC]
* The strategy for naming shapes and handling shape id conflicts has been changed. [BC]
* Output schema error detection was improved.
* The Java API surface has been reduced. [BC]
* Added the ability to select schemas from a document using a JSON pointer.

#### OpenAPI conversion

The conversion to OpenAPI was significantly overhauled. [BC] ([#275](https://github.com/awslabs/smithy/pull/275))

* Configuration for the build plugin was significantly overhauled.  [BC] ([#364](https://github.com/awslabs/smithy/pull/364))
* Protocol conversion was updated to utilize the new traits. ([#275](https://github.com/awslabs/smithy/pull/275), [#392](https://github.com/awslabs/smithy/pull/392))
* Schemas are now generated for requests and responses instead of being inlined. [BC]
* Fixed several issues with CORS integrations.

#### API Gateway OpenAPI conversion

The API Gateway specific OpenAPI mappers have been updated. [BC] ([#367](https://github.com/awslabs/smithy/pull/367))

*  The `ApiGatewayMapper` interface was added, allowing mappers to control which API Gateway API
type(s) they support.
* Fixed several issues with CORS integrations. ([#370](https://github.com/awslabs/smithy/pull/370))
* Added support for JSON Patch-like OpenAPI schema changes based on JSON Pointers. ([#293](https://github.com/awslabs/smithy/pull/293))
* Added support for event streams in OpenAPI conversion. ([#334](https://github.com/awslabs/smithy/pull/334))

### Bug Fixes

* Fixed an issue in JSON schema conversion where member traits were dropped in some scenarios. ([#274](https://github.com/awslabs/smithy/pull/274))
* Fixed an issue where authorization headers were not properly added to CORS configurations. ([#328](https://github.com/awslabs/smithy/pull/328))
* Fixed an issue where operation response headers were being applied to error responses in OpenAPI
conversions. ([#275](https://github.com/awslabs/smithy/pull/275))
* Fixed an issue where `apply` statements wouldn't resolve target shapes properly in some cases. ([#287](https://github.com/awslabs/smithy/pull/287))
* Fixed an issue with the selector for the `smithy.api#title` trait. ([#387](https://github.com/awslabs/smithy/pull/387))
* Fixed several issues with the `smithy.api#httpApiKeyAuth` trait and its related conversions. ([#291](https://github.com/awslabs/smithy/pull/291))
* Fixed a bug with timestamp validation in specific versions of Java. ([#316](https://github.com/awslabs/smithy/pull/316))

### Optimizations

* The `TraitTargetValidator` now performs as few checks on and selections of the entire model. ([#389](https://github.com/awslabs/smithy/pull/389))
* The dependency on `jackson-core` was replaced with a vendored version of `minimal-json` to reduce
the chances of dependency conflicts. [BC] ([#323](https://github.com/awslabs/smithy/pull/323))
* Sped up model loading time by loading JSON models before IDL models to reduce forward
reference lookups. ([#287](https://github.com/awslabs/smithy/pull/287))

### Breaking changes

All changes listed in this heading and any sub-headings are breaking changes.

* The `BooleanTrait` abstract class in `smithy-model` was renamed `AnnotationTrait`. ([#381](https://github.com/awslabs/smithy/pull/381))
* The traits in the `aws.apigateway` namespace have moved from `smithy-aws-traits` to the
`smithy-aws-apigateway-traits` package for more granular use. ([#322](https://github.com/awslabs/smithy/pull/322))
  * Tooling that referenced these traits has also been updated.
* The traits in the `aws.iam` namespace have moved from `smithy-aws-traits` to the
`smithy-aws-iam-traits` package for more granular use. ([#322](https://github.com/awslabs/smithy/pull/322))
  * Tooling that referenced these traits has also been updated.
* The `aws.api#ec2QueryName` trait has moved to `aws.protocols#ec2QueryName`. ([#286](https://github.com/awslabs/smithy/pull/286))
* The `aws.api#unsignedPayload ` trait has moved to `aws.auth#unsignedPayload `. ([#286](https://github.com/awslabs/smithy/pull/286))
* The `smithy-codegen-freemarker` package has been removed. ([#382](https://github.com/awslabs/smithy/pull/382))
* Traits can no longer be applied to public Smithy Prelude shapes. ([#317](https://github.com/awslabs/smithy/pull/317))
* Smithy's `Pattern` class is renamed to `SmithyPattern` to remove the conflict with Java's regex
`Pattern` class. ([#315](https://github.com/awslabs/smithy/pull/315))
* Removed the `Triple` class from `smithy-utils`. ([#313](https://github.com/awslabs/smithy/pull/313))
* Normalized class names for OpenAPI `SecurityScemeConverter` implementations. ([#291](https://github.com/awslabs/smithy/pull/291))
* Removed alias functionality from `software.amazon.smithy.build.SmithyBuildPlugin` and
  `software.amazon.smithy.build.ProjectionTransformer`. ([#409](https://github.com/awslabs/smithy/pull/409))
* Removed `software.amazon.smithy.model.shapes.Shape#visitor` and
  `software.amazon.smithy.model.shapes.ShapeVisitor$Builder`. Use
  `software.amazon.smithy.model.shapes.ShapeVisitor$Default` instead. ([#413](https://github.com/awslabs/smithy/pull/413))
* `software.amazon.smithy.model.Model#getTraitDefinitions` and `getTraitShapes` were removed in favor of
  `software.amazon.smithy.model.Model#getShapesWithTrait`. ([#412](https://github.com/awslabs/smithy/pull/412))

#### Deprecation cleanup

* The deprecated IDL operation syntax has been removed ([#373](https://github.com/awslabs/smithy/pull/373))
* The deprecated `NodeFactory` interface has been removed. ([#265](https://github.com/awslabs/smithy/pull/265))
* The deprecated `ShapeIndex` class and all related APIs have been removed. ([#266](https://github.com/awslabs/smithy/pull/266))
* Support for the deprecated `0.4.0` model version has been removed. ([#267](https://github.com/awslabs/smithy/pull/267))
* The `aws.api#service` trait no longer supports the deprecated
`sdkServiceId`, `arnService`, or `productName` properties. ([#268](https://github.com/awslabs/smithy/pull/268))
* The deprecated `TemplateEngine` and `DefaultDataTemplateEngine` have been removed. ([#268](https://github.com/awslabs/smithy/pull/268))
* The deprecated `smithy.validators` and `smithy.suppressions` are no longer used as aliases for
validators and suppressions. ([#268](https://github.com/awslabs/smithy/pull/268))
* The `smithy.api#references` and `smithy.api#idRef` traits no longer support relative shape IDs. ([#268](https://github.com/awslabs/smithy/pull/268))

### Documentation

A significant overhaul of the specification and guides has been completed. This includes a better
flow to the spec, more complete guides, deeper documentation of AWS specific components, and a
complete redesign. Many direct links to components of the documentation will have changed.

## 0.9.9 (2020-04-01)

### Bug Fixes

* Add security to individual operations in OpenAPI conversion ([#329](https://github.com/awslabs/smithy/pull/329))
* Fix an issue with header casing for `x-api-key` integration with API Gateway ([#330](https://github.com/awslabs/smithy/pull/330))
* Fix discrepancies in `smithy-aws-protocol-tests` ([#333](https://github.com/awslabs/smithy/pull/333), [#335](https://github.com/awslabs/smithy/pull/335),
  [#349](https://github.com/awslabs/smithy/pull/349))

## 0.9.8 (2020-03-26)

### Features

* Add `RenameShapes` model transformer ([#318](https://github.com/awslabs/smithy/pull/318))
* Build `ValidationEvents` are now sorted ([#263](https://github.com/awslabs/smithy/pull/263))
* Smithy CLI logging improvements ([#263](https://github.com/awslabs/smithy/pull/263))
* Model builds fail early when syntax errors occur ([#264](https://github.com/awslabs/smithy/pull/264))
* Warn when a deprecated trait is applied to a shape ([#279](https://github.com/awslabs/smithy/pull/279))

### Bug Fixes

* Fix behavior of `schemaDocumentExtensions` when converting to OpenAPI ([#320](https://github.com/awslabs/smithy/pull/320))
* Fix discrepancies in `smithy-aws-protocol-tests` ([#309](https://github.com/awslabs/smithy/pull/309), [#321](https://github.com/awslabs/smithy/pull/321))
* Properly format test case results ([#271](https://github.com/awslabs/smithy/pull/271))
* Fix dropping one character text block lines ([#285](https://github.com/awslabs/smithy/pull/285))

### Optimizations

* Builds run parallel projections in parallel only if there are more than one ([#263](https://github.com/awslabs/smithy/pull/263))
* Run Smithy test suites as parameterized tests ([#263](https://github.com/awslabs/smithy/pull/263))

### Cleanup

* Migrate protocol tests to new operation syntax ([#260](https://github.com/awslabs/smithy/pull/260))
* Build protocol tests with the Smithy Gradle plugin ([#263](https://github.com/awslabs/smithy/pull/263))
* Deprecate using explicitly `smithy.api` for trait removal ([#306](https://github.com/awslabs/smithy/pull/306))

## 0.9.7 (2020-01-15)

### Features

* Updated Operation syntax in the Smithy IDL ([#253](https://github.com/awslabs/smithy/pull/253))
* Updated specification for XML traits ([#242](https://github.com/awslabs/smithy/pull/242))
* Add the `@aws.api#ec2QueryName-trait` trait ([#251](https://github.com/awslabs/smithy/pull/251))
* Add AWS protocol test models ([#246](https://github.com/awslabs/smithy/pull/246), [#247](https://github.com/awslabs/smithy/pull/247),
  [#250](https://github.com/awslabs/smithy/pull/250), [#255](https://github.com/awslabs/smithy/pull/255),
  and [#258](https://github.com/awslabs/smithy/pull/258))

### Optimizations

* Use URLConnection cache setting in ModelAssembler ([#244](https://github.com/awslabs/smithy/pull/244))

### Bug Fixes

* Use list of string for queryParams in the `httpRequestTests` trait ([#240](https://github.com/awslabs/smithy/pull/240))

## 0.9.6 (2020-01-02)

### Features

* Allow XML maps to be flattened ([#205](https://github.com/awslabs/smithy/pull/205))
* Add and remove shape members to model automatically ([#206](https://github.com/awslabs/smithy/pull/206))
* Deprecate ShapeIndex in favor of Model ([#209](https://github.com/awslabs/smithy/pull/209))
* Allow the sensitive trait to be applied to all but operations, services, and resources ([#212](https://github.com/awslabs/smithy/pull/212))
* Added 0.5.0 IDL and AST format ([#213](https://github.com/awslabs/smithy/pull/213))
* Allow min to equal max in range trait ([#216](https://github.com/awslabs/smithy/pull/216))
* Added validation for length trait values ([#217](https://github.com/awslabs/smithy/pull/217))
* Limit streaming trait to top-level members ([#221](https://github.com/awslabs/smithy/pull/221))
* Added protocol compliance test traits ([#226](https://github.com/awslabs/smithy/pull/226))
* Added ability to configure timestamp validation ([#229](https://github.com/awslabs/smithy/pull/229))
* Moved `TemplateEngine` implementation into FreeMarker implementation ([#230](https://github.com/awslabs/smithy/pull/230))
* Added `BoxIndex` ([#234](https://github.com/awslabs/smithy/pull/234))
* Added more expect methods to `Shape` and `Model` ([#237](https://github.com/awslabs/smithy/pull/237))

### Optimizations

* Update smithy-build to be streaming ([#211](https://github.com/awslabs/smithy/pull/211))

### Bug Fixes

* Prevent bad list, set, and map recursion ([#204](https://github.com/awslabs/smithy/pull/204))
* Properly allow omitting endpoint discovery operation inputs ([#220](https://github.com/awslabs/smithy/pull/220))

## 0.9.5 (2019-11-11)

### Features

* Allow overriding state management in CodeWriter ([#186](https://github.com/awslabs/smithy/pull/186))
* Allow the `xmlFlattened` trait to be applied to members ([#191](https://github.com/awslabs/smithy/pull/191))
* Add helper to determine HTTP-based timestamp formats ([#193](https://github.com/awslabs/smithy/pull/193))
* Allow specifying XML namespace prefixes ([#195](https://github.com/awslabs/smithy/pull/195))
* Add `SymbolContainer`, an abstraction over `Symbol`s that enables easily
  creating and aggregating `Symbols` ([#202](https://github.com/awslabs/smithy/pull/202))

### Bug Fixes

* Escape popped state content ([#187](https://github.com/awslabs/smithy/pull/187))
* Make shape ID serialization consistent ([#196](https://github.com/awslabs/smithy/pull/196))
* Exclude private members targeted in JSON schema converters ([#199](https://github.com/awslabs/smithy/pull/199))
* Fix naming collisions in JSON schema output ([#200](https://github.com/awslabs/smithy/pull/200))
* Update `equals` to included typed bag parents ([#201](https://github.com/awslabs/smithy/pull/201))

## 0.9.4 (2019-10-09)

### Features

* Add support for AWS Client Endpoint Discovery ([#165](https://github.com/awslabs/smithy/pull/165))
* Refactor event streams to target members ([#171](https://github.com/awslabs/smithy/pull/171))
* Add support for aliasing referenced `Symbol`s ([#168](https://github.com/awslabs/smithy/pull/168))
* Add support for `Symbol`s to introduce dependencies ([#169](https://github.com/awslabs/smithy/pull/169))
* Add ability to manually escape reserved words in `ReservedWordSymbolProvider` ([#174](https://github.com/awslabs/smithy/pull/174))
* Add method to gather dependencies for `Symbol`s ([#170](https://github.com/awslabs/smithy/pull/170))
* Add a caching `SymbolProvider` ([#167](https://github.com/awslabs/smithy/pull/167))
* Improve the usability of `CodeWroter#openBlock` ([#175](https://github.com/awslabs/smithy/pull/175))
* Improve the usability of `PluginContext` ([#181](https://github.com/awslabs/smithy/pull/181))

### Optimizations

* Disable URLConnection cache in CLI ([#180](https://github.com/awslabs/smithy/pull/180))

### Bug Fixes

* Fix issue with generated authentication for CORS checks ([#179](https://github.com/awslabs/smithy/pull/179))
* Set the `defaultTimestampFormat` to `epoch-seconds` for `aws.rest-json` protocols in OpenAPI ([#184](https://github.com/awslabs/smithy/pull/184))

## 0.9.3 (2019-09-16)

### Features

* Clean up `CodeWriter` modifiers ([#143](https://github.com/awslabs/smithy/pull/143))
* Add typed `ObjectNode` member expectation functions ([#144](https://github.com/awslabs/smithy/pull/144))
* Add `expectShapeId` for fully-qualified shape ID ([#147](https://github.com/awslabs/smithy/pull/147))
* Add helper to `EnumTrait` to check if it has names ([#148](https://github.com/awslabs/smithy/pull/148))
* Add `Symbol` references ([#149](https://github.com/awslabs/smithy/pull/149))
* Add `ReservedWords` builder for simpler construction ([#150](https://github.com/awslabs/smithy/pull/150))
* Allow using path expressions in paginator outputs ([#152](https://github.com/awslabs/smithy/pull/152))
* Add method to get non-trait shapes ([#153](https://github.com/awslabs/smithy/pull/153))
* Add method to write class resource to manifest ([#157](https://github.com/awslabs/smithy/pull/157))
* Allow `authType` to be specified ([#160](https://github.com/awslabs/smithy/pull/160))


### Bug Fixes

* Fix collection and gradle doc issues ([#145](https://github.com/awslabs/smithy/pull/145))
* Make `AuthorizerDefinition` definition private ([#146](https://github.com/awslabs/smithy/pull/146))
* Fix put handling on `ResourceShape` ([#158](https://github.com/awslabs/smithy/pull/158))
* Fix parse error when `apply` is at eof ([#159](https://github.com/awslabs/smithy/pull/159))
* Prevent `list`/`set` member from targeting container ([#162](https://github.com/awslabs/smithy/pull/162))
* Allow model assembling from symlink model files / directory ([#163](https://github.com/awslabs/smithy/pull/163))
