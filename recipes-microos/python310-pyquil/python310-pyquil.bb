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

RPM_NAME = "python310-pyquil-3.3.3-1.4.noarch.rpm"
RPM_HASH = "d8d4e30193aa128e7c03db027ee71f231f9d5f83962704fe0712b2da147016418e304066901d5a53056a9aea8e47d7540d920f676021c5a0ac1a6b6691919295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyquil python3.10dist(pyquil) python310-pyquil python3dist(pyquil)"
RDEPENDS:${PN} += "(python310-importlib-metadata >= 3.7.3 if python310-base < 3.8) (python310-qcs-api-client >= 0.21 with python310-qcs-api-client < 0.22.0) python(abi) python310-lark python310-networkx python310-numpy python310-retry python310-rpcq python310-scipy"

inherit rpm
