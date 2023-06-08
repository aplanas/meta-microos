SUMMARY = "Support for Hercules DJ Devices"
DESCRIPTION = "This is the Hercules DJ Series Kernel Module, which supports Hercules DJ Devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.33_k6.3.1_1"

RPM_NAME = "hdjmod-kmp-64kb-1.33_k6.3.1_1-1.47.aarch64.rpm"
RPM_HASH = "3baea4826daf34c5e79c80493963e94e086024a763394000417b32be7334f2ed3e3c09d69fea03cc27044d6fc26e0e11877ed753e99dda005729259615749278"

RPROVIDES:${PN} += "hdjmod-kmp hdjmod-kmp-64kb hdjmod-kmp-64kb(aarch-64) hdjmod-kmp-64kb-k6.3.1_1 kmod(hdj_mod.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
