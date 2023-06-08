SUMMARY = "Captures the output of subprocesses in real-time"
DESCRIPTION = "This package provides a drop-in alternative to `subprocess.run` that \
captures the output while still printing it in real-time, just the way \
`tee` does. \
 \
Printing output in real-time while still capturing is valuable for \
any tool that executes long-running child processes. For those, you do want \
to provide instant feedback (progress) related to what is happening."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-subprocess-tee-0.4.1-3.1.noarch.rpm"
RPM_HASH = "49720f71e0d9ca0497a86cebd04719419712702d9416ab3a9b7c1358212bbd8fb5c2c7a3b4ddc136019ce11b9804f6f0f5c52b05c11769f334ea2fed1c189ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(subprocess-tee) python311-subprocess-tee python3dist(subprocess-tee)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
