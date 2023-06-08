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

RPM_NAME = "python311-pyquil-3.3.3-1.4.noarch.rpm"
RPM_HASH = "8430550bd0c9b103169c3883baf637bf26609e9c33d5893887635cb45a877fa24b698a151daa6c3d4c247a4b549dc1032f36b97bceefb87d11ab6212d71251a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyquil) python311-pyquil python3dist(pyquil)"
RDEPENDS:${PN} += "(python311-importlib-metadata >= 3.7.3 if python311-base < 3.8) (python311-qcs-api-client >= 0.21 with python311-qcs-api-client < 0.22.0) python(abi) python311-lark python311-networkx python311-numpy python311-retry python311-rpcq python311-scipy"

inherit rpm
