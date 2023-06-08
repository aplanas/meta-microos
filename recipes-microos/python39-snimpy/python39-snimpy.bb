SUMMARY = "Interactive SNMP tool"
DESCRIPTION = "Snimpy is a Python-based tool providing a simple interface to build \
SNMP query. You can either use Snimpy interactively through its console \
(derived from Python own console or from IPython_ if available) or write \
Snimpy scripts which are just Python scripts with some global variables \
available. \
 \
Snimpy is aimed at being the more Pythonic possible. You should forget \
that you are doing SNMP requests. Snimpy will rely on MIB to hide SNMP \
details. Here are some 'features': \
 \
 * MIB parser based on libsmi  (through CFFI) \
 * SNMP requests are handled by PySNMP (SNMPv1, SNMPv2 and SNMPv3 \
   support) \
 * scalars are just attributes of your session object \
 * columns are like a Python dictionary and made available as an \
   attribute \
 * getting an attribute is like issuing a GET method \
 * setting an attribute is like issuing a SET method \
 * iterating over a table is like using GETNEXT \
 * when something goes wrong, you get an exception"
LICENSE = "ISC"

PV = "1.0.0"

RPM_NAME = "python39-snimpy-1.0.0-2.7.aarch64.rpm"
RPM_HASH = "ae493d5dd9c0bde8705bdb768113eef86ec16c6c932ab1d2e5df849e1477b1eca5cc852664e5ad9f34e9d2295844aa994ebb3b67d909870f0eeca4946f8dd761"

RPROVIDES:${PN} += "python3.9dist(snimpy) python39-snimpy python39-snimpy(aarch-64) python3dist(snimpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsmi.so.2()(64bit) python(abi) python39-cffi python39-pycryptodomex python39-pysnmp python39-setuptools update-alternatives"

inherit rpm
