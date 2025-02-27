namespace smithy.example

use aws.protocols#httpChecksum

@httpChecksum(
    requestAlgorithmMember: "requestAlgorithm",
    requestValidationModeMember: "validationMode",
    responseAlgorithms: ["CRC32C"]
)
@http(method: "GET", uri: "/headerconflict")
@readonly
@suppress(["UnstableTrait"])
operation HeaderConflicts {
    input: HeaderConflictsInput,
    output: HeaderConflictsOutput,
    errors: [HeaderConflictError,]
}

@httpChecksum(
    requestAlgorithmMember: "requestAlgorithm",
    requestValidationModeMember: "validationMode",
    responseAlgorithms: ["CRC32C"]
)
@http(method: "GET", uri: "/headersconflict")
@readonly
@suppress(["UnstableTrait"])
operation HeadersConflicts {
    input: HeadersConflictsInput,
    output: HeadersConflictsOutput,
    errors: [HeadersConflictError,]
}

@httpChecksum(
    requestAlgorithmMember: "requestAlgorithm",
    requestValidationModeMember: "validationMode",
    responseAlgorithms: ["CRC32C"]
)
@http(method: "GET", uri: "/noconflict")
@readonly
@suppress(["UnstableTrait"])
operation NoConflicts {
    input: NoConflictsInput,
    output: NoConflictsOutput,
    errors: [NoConflictError,]

}

structure HeaderConflictsInput {
    @httpHeader("x-amz-checksum-crc32")
    warningConflictHeader: String,

    @httpQuery("requestAlgorithm")
    requestAlgorithm: ChecksumAlgorithm,

    @httpQuery("validationMode")
    validationMode: ValidationMode,
}

structure HeaderConflictsOutput {
    @httpHeader("x-amz-checksum-CRC32")
    warningConflictHeader: String,
}

structure HeadersConflictsInput {
    @httpPrefixHeaders("x-amz-checksum-")
    dangerConflictHeaders: StringMap,

    @httpQuery("requestAlgorithm")
    requestAlgorithm: ChecksumAlgorithm,

    @httpQuery("validationMode")
    validationMode: ValidationMode,
}

structure HeadersConflictsOutput {
    @httpPrefixHeaders("x-amz-checksum-")
    dangerConflictHeaders: StringMap,
}

structure NoConflictsInput {
    @httpHeader("x-safe-header")
    noConflictHeader: String,

    @httpPrefixHeaders("x-foo")
    noConflictHeaders: StringMap,

    @httpQuery("requestAlgorithm")
    requestAlgorithm: ChecksumAlgorithm,

    @httpQuery("validationMode")
    validationMode: ValidationMode,
}

structure NoConflictsOutput {
    @httpHeader("x-safe-header")
    noConflictHeader: String,

    @httpPrefixHeaders("x-foo")
    noConflictHeaders: StringMap,
}

@error("client")
@httpError(400)
structure HeaderConflictError {
    @httpHeader("x-amz-checksum-CRC32")
    warningConflictHeader: String,
}

@error("client")
@httpError(400)
structure HeadersConflictError {
    @httpPrefixHeaders("x-amz-checksum-")
    dangerConflictHeaders: StringMap,
}

@error("client")
@httpError(401)
structure NoConflictError {
    @httpHeader("x-safe-header")
    noConflictHeader: String,

    @httpPrefixHeaders("x-foo")
    noConflictHeaders: StringMap,
}

@enum([
    {
        value: "CRC32C",
        name: "CRC32C"
    },
    {
        value: "CRC32",
        name: "CRC32"
    },
    {
        value: "SHA1",
        name: "SHA1"
    },
    {
        value: "SHA256",
        name: "SHA256"
    }
])
string ChecksumAlgorithm

@enum([
    {
        value: "ENABLED",
        name: "ENABLED"
    }
])
string ValidationMode

map StringMap {
    key: String,
    value: String
}
