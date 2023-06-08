SUMMARY = "A Python library to generate Quantum Instruction Language (Quil) Programs"
DESCRIPTION = "PyQuil is a Python library for quantum programming using Quil, \
the quantum instruction language developed at Rigetti Computing. \
PyQuil serves three main functions: \
  - Easily generating Quil programs from quantum gates and \
    classical operations \
  - Compiling and simulating Quil programs using the Quil \
    Compiler (quilc) and the Quantum Virtual Machine (QVM) \
  - Executing Quil programs on real quantum processors (QPUs) \
    using Quantum Cloud Services (QCS)"
LICENSE = "Apache-2.0"

PV = "3.3.3"

RPM_NAME = "python39-pyquil-3.3.3-1.4.noarch.rpm"
RPM_HASH = "5e3518466ac53fe28346d7058b95e80b8bae288e36c9d00676bdbad0fc913d8208e26a7880f8d4fb2540dd8cfed634506b78b0df402a9d9b12cbe404ebb3b90e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyquil) python39-pyquil python3dist(pyquil)"
RDEPENDS:${PN} += "(python39-importlib-metadata >= 3.7.3 if python39-base < 3.8) (python39-qcs-api-client >= 0.21 with python39-qcs-api-client < 0.22.0) python(abi) python39-lark python39-networkx python39-numpy python39-retry python39-rpcq python39-scipy"

inherit rpm
