SUMMARY = "Python library for run time variable type checker"
DESCRIPTION = "typepy is a Python library for variable type checker/validator/converter at run time."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-typepy-1.3.0-2.8.noarch.rpm"
RPM_HASH = "8204379b8fc72e2fbea6d8aee642afb55d4e055ae9f3c065a8d883c92806a9776fd81242ddefedd57fb003d52b547ba6afa1fea931ad4b667a66c014f1b291ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(typepy) python311-typepy python3dist(typepy)"
RDEPENDS:${PN} += "python(abi) python311-mbstrdecoder"

inherit rpm
