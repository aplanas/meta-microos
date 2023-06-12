SUMMARY = "Translation of man pages in Finnish"
DESCRIPTION = "This package provides translations of man pages in Finnish."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-fi-4.19.0-1.1.noarch.rpm"
RPM_HASH = "c1eefcfe6aa11df20212f397a5d5a77fb89d0e131faeeca014f2ee5100ecb4118a9bcf8a7fc0ecedf6cb55c317d5f8c0a2d68a3371062cf674faa2bdfd77d191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:fi) \
man-pages-fi"
RDEPENDS:${PN} += "man-pages"

inherit rpm
