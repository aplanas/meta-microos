SUMMARY = "Local Plugin for DNF"
DESCRIPTION = "Local Plugin for DNF, Python 3 version. Automatically copy all downloaded \
packages to a repository on the local filesystem and generating repo metadata."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-local-4.3.1-2.1.noarch.rpm"
RPM_HASH = "a7ed928e529c73d178a553797a3d8fce786b8b4756cb0bf060bfd07703203ef988b0ecff5ee76ddf1d4dc9c82ee9d5646a9d4aa2d57debdc6d5eb9452a44696f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-dnf-plugin-local) dnf-plugin-local dnf-plugins-extras-local python3-dnf-plugin-local python3-dnf-plugins-extras-local"
RDEPENDS:${PN} += "createrepo_c python(abi) python3-dnf-plugins-core"

inherit rpm
