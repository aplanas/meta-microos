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

RPM_NAME = "python39-subprocess-tee-0.4.1-4.1.noarch.rpm"
RPM_HASH = "97874bb8bfa8f2aa4a30b3dd1d2442ad0e487d9cee6ccd56c2a1ec7f2cf64b22da2c9f9ab63d2e646d9b689c56c8f9c95e70b4a50d13cb9a69a1c47b0362b772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(subprocess-tee) python39-subprocess-tee python3dist(subprocess-tee)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
