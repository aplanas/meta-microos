SUMMARY = "Development files for the Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
Needed for compiling programs that link with the library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd-devel-static-1.5.5-3.1.aarch64.rpm"
RPM_HASH = "11149e898c8072adb6894414857a97bf484289f376adb0b12fec0ca34b5140c4a69013e8ee3a844c9a315b48e43042f01ed7add146f2a0b307319ee46044c96e"

RPROVIDES:${PN} += "libzstd-devel-static libzstd-devel-static(aarch-64)"
RDEPENDS:${PN} += "libzstd-devel"

inherit rpm
