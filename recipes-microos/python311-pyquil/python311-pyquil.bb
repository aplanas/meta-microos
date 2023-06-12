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

PV = "3.5.2"

RPM_NAME = "python311-pyquil-3.5.2-1.1.noarch.rpm"
RPM_HASH = "7636b622aadd0950e5c20ba5bd4276b471fd041baf7bdeeade1f1639a1bd6cbe6ca8ce9051fe34cde467ec8759d2444530d6a2fcf4a5e202805f6670e661333e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyquil) python311-pyquil python3dist(pyquil)"
RDEPENDS:${PN} += "(python311-importlib-metadata >= 3.7.3 if python311-base < 3.8) (python311-qcs-api-client >= 0.21 with python311-qcs-api-client < 0.22.0) python(abi) python311-Deprecated python311-lark python311-networkx python311-numpy python311-rpcq python311-scipy python311-tenacity"

inherit rpm
