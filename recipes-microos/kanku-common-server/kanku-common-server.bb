SUMMARY = "Common server files or settings for kanku"
DESCRIPTION = "This package contains common server files, settings and dependencies \
for the kanku server components like kanku-worker, kanku-dispatcher, \
kanku-web, kanku-scheduler and kanku-triggerd."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-common-server-0.14.0-1.3.noarch.rpm"
RPM_HASH = "8864a47292b23a6445e9e401310f0cc4d568c6733ede3598c01495c4a81863726a78ebb17caa87964bec95f6c1ba507943672772c5440a2bde2bd5123e77773f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-common-server"
RDEPENDS:${PN} += "/bin/sh libvirt-daemon libvirt-daemon-driver-qemu shadow"

inherit rpm
