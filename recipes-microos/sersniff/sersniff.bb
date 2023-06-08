SUMMARY = "A simple program to tunnel/sniff between 2 serial ports"
DESCRIPTION = "This program was written to aid with the decoding of the protocol \
used by serial communication. It has support for sniffing a TCP \
connection or between a serial port and a TCP port."
LICENSE = "GPL-2.0-only"

PV = "0.0.5"

RPM_NAME = "sersniff-0.0.5-1.12.aarch64.rpm"
RPM_HASH = "4871fec9ddb370b1413317bd7c944b69c60b12a57fab02a8f4e5c1d33a6550b1aa90a350f59f77dbfbdb2fa71b6b8365d572824af94979dbdde2a3aedc788287"

RPROVIDES:${PN} += "sersniff sersniff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
