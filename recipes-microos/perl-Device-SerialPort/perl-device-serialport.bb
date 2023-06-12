SUMMARY = "Linux/POSIX emulation of Win32::SerialPort functions"
DESCRIPTION = "This module provides an object-based user interface essentially identical \
to the one provided by the Win32::SerialPort module."
LICENSE = "Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Device-SerialPort-1.04-26.37.aarch64.rpm"
RPM_HASH = "83e2a2735cc0ffc417a6efaa83e9e4e3bccb66cdb0967d4c5937874271bf1303dfd3403189765c33de309bacc6803e6b14f4f90268f6bf026c82ff3748907b3b"

RPROVIDES:${PN} += "Device-SerialPort \
perl(Device::SerialPort) \
perl-Device-SerialPort \
perl-Device-SerialPort(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
