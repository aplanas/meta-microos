SUMMARY = "Program to find problems in C++ source code"
DESCRIPTION = "CPPclean attempts to find problems in C++ source that slow development \
in large code bases, for example various forms of unused code. \
Unused code can be unused functions, methods, data members, types, etc \
to unnecessary #include directives. Unnecessary #includes can cause \
considerable extra compiles increasing the edit-compile-run cycle."
LICENSE = "Apache-2.0"

PV = "0.13"

RPM_NAME = "python311-cppclean-0.13-2.18.noarch.rpm"
RPM_HASH = "ff13d180b1cf0a4a09035e07de15ddf636812d651ff23cc4162620e8c448899e7808449435f7a5befb738763d2da4378d8f1e9b9f58bb8d0d10967a0f084f5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cppclean) python311-cppclean python3dist(cppclean)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
