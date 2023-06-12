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

PV = "1.4.3"

RPM_NAME = "python310-kwant-1.4.3-1.1.aarch64.rpm"
RPM_HASH = "23c1feee90f96ae24754694ac560379a03d2346ee49a74098edd1b4309c016f05f4c936d66fca430b6cc69f61cf5e602d3e495bbdeebc4e1c7d97aeaef2aa3d5"

RPROVIDES:${PN} += "python3-kwant \
python3.10dist(kwant) \
python310-kwant \
python310-kwant(aarch-64) \
python3dist(kwant)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libzmumps_seq.so.5.3.5()(64bit) \
python(abi) \
python310-numpy \
python310-scipy \
python310-tinyarray"

inherit rpm
