SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.76"

RPM_NAME = "python310-flynt-0.76-1.8.noarch.rpm"
RPM_HASH = "126c449e9c9721673e398870090e44f0d5aa8f78d81f282ea4517b3596181266d11d7c81fa05aa2342e5ff4b020db7cf0ed6211f0e47ae1ce5cbe1bb17effd68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flynt \
python3.10dist(flynt) \
python310-flynt \
python3dist(flynt)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-astor \
python310-tomli"

inherit rpm
