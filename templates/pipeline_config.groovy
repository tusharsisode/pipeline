stages {
  stage_checkout {
    code_checkout
  }
  stage_build {
    code_build
  }
  stage_test {
    code_test
  }
}

libraries {
  gradle
  common
}
