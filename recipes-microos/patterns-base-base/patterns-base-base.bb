SUMMARY = "Base System"
DESCRIPTION = "This is the base runtime system.  It contains only a basic multiuser booting system. For running on real hardware, you need to add additional packages and pattern to make this pattern useful on its own."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-base-20200505-40.1.aarch64.rpm"
RPM_HASH = "98d8d4f56cbd9fa0cb66613cd4638dcbebb8e84d8d2f04f8f8c74746edec3a78f5645b40e1dfd0b84107ca616ac561ee9e61f64031fa1a46b1431af442025c65"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-base patterns-base-base(aarch-64) patterns-openSUSE-base patterns-openSUSE-minimal"
RDEPENDS:${PN} += "aaa_base bash ca-certificates-mozilla coreutils glibc libnss_usrfiles2 pam pam-config pattern() purge-kernels-service rpm system-user-nobody systemd util-linux"

inherit rpm
