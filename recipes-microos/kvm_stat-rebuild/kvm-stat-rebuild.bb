SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kvm_stat-rebuild-6.3.1-22.19.noarch.rpm"
RPM_HASH = "eebaa2a4aaf1e457dee654e3d755ebaaefc288df2a4ffba0a1d75bda5b7fc457bca324f21c89111410d321043fcf51c1fc9501f52349a9e89d31bf2f1acaf9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm_stat-rebuild"
RDEPENDS:${PN} += "kernel-source"

inherit rpm
