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

RPM_NAME = "python39-kwant-1.4.3-1.1.aarch64.rpm"
RPM_HASH = "e74c4b6ee1b301bde6336d3f843792957aeb1f14c1a714f8317bf0178b6f506fcd3e64b9719a7738d6e3255e707a03977a1971d163543439ab79cc9aee96ff6b"

RPROVIDES:${PN} += "python3.9dist(kwant) \
python39-kwant \
python39-kwant(aarch-64) \
python3dist(kwant)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libzmumps_seq.so.5.3.5()(64bit) \
python(abi) \
python39-numpy \
python39-scipy \
python39-tinyarray"

inherit rpm
