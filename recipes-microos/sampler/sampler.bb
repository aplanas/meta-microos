SUMMARY = "A tool for shell commands execution, visualization and alerting"
DESCRIPTION = "Sampler is a tool for shell commands execution, visualization and alerting. Configured with a simple YAML file."
LICENSE = "GPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "sampler-1.1.0-2.11.aarch64.rpm"
RPM_HASH = "67ff2d11a2b12a9db029773a21516d037f74e1d288e564bd47265949270706ca3dc9751d79aba032426d17040d36c45659cfffbc969d721939a835200521b5e6"

RPROVIDES:${PN} += "sampler sampler(aarch-64)"
RDEPENDS:${PN} += "libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
