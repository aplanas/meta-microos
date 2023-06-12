SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-openmpi2-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "3d27ad4c805b110f453f6b9da250e63b9ef50f7e54b378155f69d13d5409fe0823ac5a13411a3c783ffd2622a18beeeac29e9aa7322a625d9832690817d062ef"

RPROVIDES:${PN} += "ptscotch-parmetis-openmpi2-devel \
ptscotch-parmetis-openmpi2-devel(aarch-64)"
RDEPENDS:${PN} += "libptscotch0-openmpi2 \
ptscotch-openmpi2-devel"

inherit rpm
