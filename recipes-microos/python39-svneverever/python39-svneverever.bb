SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "python39-svneverever-1.7.1-1.4.noarch.rpm"
RPM_HASH = "7c8555de1560a40aa3e90dfbe5abd285ffbf617febd1180a99b7032ab4b36eca929e18ca102c9f550b8aae3eaa9a90cf5ce88f31cd2d5756c8421760760472d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(svneverever) \
python39-svneverever \
python3dist(svneverever)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
subversion \
update-alternatives"

inherit rpm
