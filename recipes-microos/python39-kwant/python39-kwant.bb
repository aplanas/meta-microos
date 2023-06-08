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

RPM_NAME = "python39-kwant-1.4.2-3.12.aarch64.rpm"
RPM_HASH = "d308c4ca3c681d8a2146b8d842297b7fe300437e4a82023b11344a83233834cab95eb2acfc4555c10b9399c9120831412165632d028e26813345125b14c2f89b"

RPROVIDES:${PN} += "python3.9dist(kwant) python39-kwant python39-kwant(aarch-64) python3dist(kwant)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libzmumps_seq.so.5.3.5()(64bit) python(abi) python39-numpy python39-scipy python39-tinyarray"

inherit rpm
