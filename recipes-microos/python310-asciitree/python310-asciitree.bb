SUMMARY = "Python module to draw ASCII trees"
DESCRIPTION = "ASCIItree draws tree structures using characters."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python310-asciitree-0.3.3-3.11.noarch.rpm"
RPM_HASH = "af8faaf7d6cba4afbd4531e3641b0a23b9d35face1887fccb53ccf848b468cb4fc38433e249482aa37b160713d896be0445fbe210385bfd208f86688befc6312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asciitree python3.10dist(asciitree) python310-asciitree python3dist(asciitree)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
