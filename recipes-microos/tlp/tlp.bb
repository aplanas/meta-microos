SUMMARY = "Tools to save battery power on laptops"
DESCRIPTION = "TLP implements advanced power management for Linux. \
TLP is a pure command line tool with automated background tasks. \
It does not contain a GUI."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.5.0"

RPM_NAME = "tlp-1.5.0-1.3.noarch.rpm"
RPM_HASH = "669aa7f712b0c32c5b718a9c289d98b19fd73764d859be14694c4c280af8a7fb3bc2f84cca3b40db513926720eee64f1ed4919e5f087010805593fda6be468c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(tlp) \
metainfo() \
metainfo(de.linrunner.tlp.metainfo.xml) \
tlp"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
hdparm \
iw \
pciutils \
rfkill \
systemd \
usbutils \
util-linux"

inherit rpm
