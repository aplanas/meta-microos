SUMMARY = "Library to detect surrounding shell"
DESCRIPTION = "Python library to detect surrounding shell."
LICENSE = "ISC"

PV = "1.5.0"

RPM_NAME = "python310-shellingham-1.5.0-2.1.noarch.rpm"
RPM_HASH = "672c4a20a5f9aa00f7fd27df7969cf393102a67a14ad6be065499bb5fcbde6afee0170c81d511d8dc219b71ad73019a705853a4ce5bb71d9f02d34dcd100d12b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shellingham \
python3.10dist(shellingham) \
python310-shellingham \
python3dist(shellingham)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
