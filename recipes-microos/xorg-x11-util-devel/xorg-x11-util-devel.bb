SUMMARY = "Compatibility metapackage for X11 development"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
gccmakedep, imake, lndir, makedepend, xorg-cf-files, xorg-sgml-doctools \
utilities."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-util-devel-7.6_1-10.16.noarch.rpm"
RPM_HASH = "7d187c7f2b215eb265eacb06e64775c67d690bd759e7f58cba7ffa8ca04339fdf3c0161a4633166c4b7b4c89fd741304460ec779559edd007b5fc194f920cc89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-util-devel"
RDEPENDS:${PN} += "gccmakedep imake lndir makedepend xorg-cf-files xorg-sgml-doctools"

inherit rpm
