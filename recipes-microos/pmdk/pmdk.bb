SUMMARY = "Persistent Memory Development Kit"
DESCRIPTION = "The Persistent Memory Development Kit (PMDK), formerly known as NVML \
(Non-Volatile Memory Library), is a collection of libraries and tools \
built on the DAX (Direct Access) feature of the Linux kernel which \
allows applications to access persistent memory as memory-mapped \
files, as described in the SNIA NVM Programming Model."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "pmdk-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "01f0da2e248fe367f2920daaf2429aa0e171398b6b26a40daab34733684597e2754fa595de94e777fe9a843ca90a0b006d7a22e6af613f769f3179addd56b012"

RPROVIDES:${PN} += "nvml pmdk pmdk(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
