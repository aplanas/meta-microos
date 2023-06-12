SUMMARY = "String colorization for Python"
DESCRIPTION = "Pastel is a library to colorize strings in the terminal."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-pastel-0.2.1-1.5.noarch.rpm"
RPM_HASH = "7d0240d773f605b4a179de16dd2052bce2e2332d89db75ea2b21fe12dda0bf5545d45fd9e62b01889b74fa2d15df51729bc53cd217afe15090a53671403f59d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pastel \
python3.10dist(pastel) \
python310-pastel \
python3dist(pastel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
