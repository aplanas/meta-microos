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

RPM_NAME = "python310-snimpy-1.0.0-2.7.aarch64.rpm"
RPM_HASH = "01c3a53bebc62c7bfc54d6c0d03577b7619ff281815a3aef71525e1c2801694eca8b5e13b7d198cebf60a9fcbd14d2b1dd28e6dee50cae37536861d55aef2ff3"

RPROVIDES:${PN} += "python3-snimpy python3.10dist(snimpy) python310-snimpy python310-snimpy(aarch-64) python3dist(snimpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsmi.so.2()(64bit) python(abi) python310-cffi python310-pycryptodomex python310-pysnmp python310-setuptools update-alternatives"

inherit rpm
