SUMMARY = "Python module for creating testable command-line interfaces"
DESCRIPTION = "Cleo allows you to create beautiful and testable command-line interfaces."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-cleo-2.0.1-2.1.noarch.rpm"
RPM_HASH = "f9aab6f5977904a6d809cac5f85fccccb932b58e64c4a1c1461c8bbff8c4a63fde8f155e2cfbabe83939aa4b4dd43fc6f6afca4b4ad1a760e95eb6248e542091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cleo python3.10dist(cleo) python310-cleo python3dist(cleo)"
RDEPENDS:${PN} += "python(abi) python310-crashtest python310-pylev python310-rapidfuzz"

inherit rpm
