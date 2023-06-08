SUMMARY = "LIRC development files"
DESCRIPTION = "LIRC is a package that supports receiving and sending IR signals with \
the most common IR remote controls. It contains a daemon that decodes \
and sends IR signals, a mouse daemon that translates IR signals to \
mouse movements, and a couple of user programs that allow you to \
control your computer with a remote control."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-devel-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "b4c2385238ae8f3843447d12a80c1973c265327cefdb53dc06a3d451b9febb5129cba8c4a1e5e382744643ec93e886d6c6cdea0ae39ff54547c76f1f924aa17f"

RPROVIDES:${PN} += "lirc-devel lirc-devel(aarch-64) pkgconfig(lirc) pkgconfig(lirc-driver)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libirrecord0 liblirc0 liblirc_client0 liblirc_driver0"

inherit rpm
