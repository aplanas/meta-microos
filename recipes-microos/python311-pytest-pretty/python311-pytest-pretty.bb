SUMMARY = "Pytest plugin for printing summary data as I want it"
DESCRIPTION = "Opinionated pytest plugin to make output slightly easier to read \
and errors easy to find and fix."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-pytest-pretty-1.2.0-1.1.noarch.rpm"
RPM_HASH = "b8afa90fc206a165a9e9b4054807c55378a414b649b21198a11ead2c6c37cebb2410b2c284774ced145946233fe30ab65768c977919525624a1b198dee08b4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-pretty) python311-pytest-pretty python3dist(pytest-pretty)"
RDEPENDS:${PN} += "python(abi) python311-pytest python311-rich"

inherit rpm
