SUMMARY = "Workarounds for problems with Steam on Linux"
DESCRIPTION = "steamtricks provides workarounds for problems with Steam on Linux. \
 \
Steam primarily targets Ubuntu and not the wider base of Linux distributions. \
This has led to a number of suboptimal experiences for users not on an \
officially supported distribution. The goal of this project is to \
provide workarounds and solutions to those problems in an easy to use package. \
Currently, workarounds exist in some distribution packages and in various forums \
and the like. This project aims to be the upstream source for packaging Steam \
fixes."
LICENSE = "GPL-2.0-only"

PV = "0.3.1"

RPM_NAME = "steamtricks-0.3.1-2.2.noarch.rpm"
RPM_HASH = "4d4183f7ba14da11ce30e1d2e0b68d4747f46e2c92e68751b4f1e13688350a05fbbc6b68f190d87d183e9b96feb63978ac3243fd32ce90f08133fcbed27ff078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "steamtricks"
RDEPENDS:${PN} += "/usr/bin/env \
coreutils \
findutils \
grep \
patch \
rpm \
sed \
systemd \
util-linux \
which"

inherit rpm
