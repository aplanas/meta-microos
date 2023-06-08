SUMMARY = "Python git tag based version numbers"
DESCRIPTION = "Simple git tag based version numbers."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python39-versiontag-1.2.0-2.8.noarch.rpm"
RPM_HASH = "1df2977126205020268a89bb8f18fdfb30975e1f8389e9f520fc454657a31784b439b88f3ba2b8774d75f7312785d541042944eac0e7f0628b42fa2d2be1c377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(versiontag) python39-versiontag python3dist(versiontag)"
RDEPENDS:${PN} += "git-core python(abi)"

inherit rpm
