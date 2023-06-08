SUMMARY = "LADSPA super-60 plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin for 16th order IIR Filter modeled after an impulse response from \
a Fender 'Super 60' guitar amplifier."
LICENSE = "GPL-2.0+"

PV = "1"

RPM_NAME = "ladspa-super-60-1-3.24.aarch64.rpm"
RPM_HASH = "c60d5b0b500a3a6e8d9455b49d9e07b81b4d6028b832c5048dbb267f95a864f31f672b969b3860aff9165692729c22e8bd7cce96f092243d4f101711d8f1f523"

RPROVIDES:${PN} += "ladspa-super-60 ladspa-super-60(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
