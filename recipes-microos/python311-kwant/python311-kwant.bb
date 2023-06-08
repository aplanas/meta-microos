SUMMARY = "Python library for numerical quantum transport calculations"
DESCRIPTION = "Kwant is a Python library for numerical calculations on tight-binding \
models with a strong focus on quantum transport. Kwant can be used to \
simulate a variety of systems and phenomena in quantum physics \
including: metals, graphene, topological insulators, quantum Hall \
effect, superconductivity, spintronics, molecular electronics, any \
combination of the above, and many other things. Kwant can calculate \
transport properties (conductance, noise, scattering matrix), \
dispersion relations, modes, wave functions, various Green’s \
functions, out-of-equilibrium local quantities."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "python311-kwant-1.4.2-3.12.aarch64.rpm"
RPM_HASH = "c79613adf3df657f7bf37b60bf8c3f64284123f40fd5b2f014de5b4d33e01c2e07a9e80b012c6b7247500ae8c7280b620ea33097561f1db52a168b67e7d294f6"

RPROVIDES:${PN} += "python3.11dist(kwant) python311-kwant python311-kwant(aarch-64) python3dist(kwant)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libzmumps_seq.so.5.3.5()(64bit) python(abi) python311-numpy python311-scipy python311-tinyarray"

inherit rpm
