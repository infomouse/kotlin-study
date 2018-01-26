class User(val email: String, var isBlocked: Boolean) {
    val isNotBlocked
        get() = !isBlocked
}

fun blockUser(user: User) {
    user.isBlocked = true
}

fun User.block() {
    this.isBlocked = true
}
