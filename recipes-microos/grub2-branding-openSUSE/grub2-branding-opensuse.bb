SUMMARY = "openSUSE Tumbleweed branding for GRUB2"
DESCRIPTION = "openSUSE Tumbleweed branding for the GRUB2's graphical console"
LICENSE = "CC-BY-SA-3.0"

PV = "84.87.20230227"

RPM_NAME = "grub2-branding-openSUSE-84.87.20230227-1.1.noarch.rpm"
RPM_HASH = "e89e8b919178763343b52933a318bbc72a7877004d5cde95ea02c2dc507c73b6bfb1b95c7b302a264a4bc74b9d10b75aaedbdfc924d5144c4aaa736b98fd8e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-branding \
grub2-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
grub2"

inherit rpm
