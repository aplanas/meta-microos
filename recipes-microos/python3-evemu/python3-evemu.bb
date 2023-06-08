SUMMARY = "Python3 bindings for evemu"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices. \
 \
This package provides the Python3 bindings for evemu."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "python3-evemu-2.7.0-3.12.aarch64.rpm"
RPM_HASH = "b3e601f707dcecb891f5b9265713e11921198e2876495d3046043edd02e9df71835e58cc828f3c6dc280cea1a5a0103de2ac2c14f0b3a3fcc79108b473a701fd"

RPROVIDES:${PN} += "python3-evemu python3-evemu(aarch-64)"
RDEPENDS:${PN} += "libevemu3 python(abi)"

inherit rpm
