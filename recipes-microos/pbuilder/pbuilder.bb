SUMMARY = "Personal package builder for .deb packages"
DESCRIPTION = "pbuilder constructs a chroot system, and builds a package inside the \
chroot. It uses apt extensively, and a local mirror, or a fast \
connection to a Debian/Ubuntu mirror is ideal, but not necessary. \
 \
'pbuilder create' uses debootstrap to create a chroot image. \
 \
'pbuilder update' updates the image to the current state of \
testing/unstable/whatever \
 \
'pbuilder build' takes a *.dsc file and builds a binary in the chroot \
image. \
 \
pdebuild is a wrapper for developers, to allow running pbuilder \
just like 'debuild', as a normal user. \
 \
Authors: \
-------- \
    Junichi Uekawa"
LICENSE = "GPL-2.0-or-later"

PV = "0.231"

RPM_NAME = "pbuilder-0.231-1.4.noarch.rpm"
RPM_HASH = "f258f3b4af74c1cd327af811f35aede380bcd48cf2fae5df02787c2a6b9c6d38492e38bc276278f56e1339e73a4ea59382ade6d58a7634d0565641d2bc821188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(pbuilder) pbuilder"
RDEPENDS:${PN} += "/bin/bash /bin/sh debootstrap dpkg wget"

inherit rpm
