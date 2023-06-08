SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-5.0-69.1.aarch64.rpm"
RPM_HASH = "ea78502b0f024f92f3b52e11d60933213f1131cca67290ccc9c0d207246944e5893cd0e81d1f5b91b77eaf2aca92102f4d214ee55133f08d098c620275a5c519"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-base patterns-microos-base(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/gzip /usr/bin/hostname MicroOS-release NetworkManager NetworkManager-wifi aaa_base bash branding-openSUSE btrfsmaintenance btrfsprogs busybox ca-certificates ca-certificates-mozilla chrony coreutils curl dosfstools glibc glibc-locale-base group(nobody) health-checker health-checker-plugins-MicroOS iproute2 iputils issue-generator kdump lastlog2 less libnss_usrfiles2 microos-tools openSUSE-build-key openssh pam pam-config pattern() procps rebootmgr rpm shadow snapper sudo systemd systemd-presets-branding-MicroOS terminfo-base timezone user(nobody) util-linux vim-small yast2-logs"

inherit rpm
