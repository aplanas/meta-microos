SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virtctl-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "cee27f11d3440bfebe475cb9c6edc172897dbaf10cec9cd0251124651bbedabe6aadb90c10a8ebd6b31a94bd7e0c19cc0a6e9e927ca280d79375221d8078edbe"

RPROVIDES:${PN} += "kubevirt-virtctl kubevirt-virtctl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
