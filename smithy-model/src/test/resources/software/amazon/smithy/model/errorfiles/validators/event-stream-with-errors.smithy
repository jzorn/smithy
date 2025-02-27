namespace smithy.example

operation SubscribeToMovements {
    output: SubscribeToMovementsOutput
}

structure SubscribeToMovementsOutput {
    movements: MovementEvents,
}

@streaming
union MovementEvents {
    up: Movement,
    down: Movement,
    left: Movement,
    right: Movement,
    throttlingError: ThrottlingError
}

structure Movement {
    velocity: Float,
}

/// An example error emitted when the client is throttled
/// and should terminate the event stream.
@error("client")
@retryable(throttling: true)
structure ThrottlingError {}
