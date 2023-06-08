SUMMARY = "Standard Japanese Dictionary for ChaSen"
DESCRIPTION = "Standard Japanese dictionary for ChaSen."
LICENSE = "SUSE-Permissive"

PV = "2.7.0"

RPM_NAME = "ipadic-2.7.0-1.6.noarch.rpm"
RPM_HASH = "0e1478c5f5e6ca64ede80f207c88b3ff27dd5d7b686f8dd080b23f8b7f56e1bb673786ee82a3ae2aa3d516c6d45943b1fa6cd675f47df4784ad84c2351f8f0d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(ipadic) ipadic"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
