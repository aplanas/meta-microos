SUMMARY = "Files and Scripts for a RO root fileystem"
DESCRIPTION = "Files, scripts and directories to run the system with a \
read-only root filesystem with /etc writeable via overlayfs. \
 \
This package should never be installed in an already running \
system! It should only be selected by a system role for a \
read-only root filesystem with transactional updates. \
The package will create / modify entries for mounting /etc and /var. \
Those entries are used by dracut to mount the overlay file systems \
during the early boot phase."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20220808.cd59f4f"

RPM_NAME = "read-only-root-fs-1.0+git20220808.cd59f4f-1.3.noarch.rpm"
RPM_HASH = "dd2da80364ac5bc4719907c46622747b08dede016facf71b760eb3fa8d2017d2f20a1e0b58f3c1b0f87e1e5e362b094405bc0d7fa8a2f875a7c9419dd81063ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(read-only-root-fs) \
read-only-root-fs"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/cat \
/usr/bin/mkdir \
/usr/bin/sed \
dracut \
gawk \
snapper"

inherit rpm
