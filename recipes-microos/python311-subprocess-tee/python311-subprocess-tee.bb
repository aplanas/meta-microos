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

RPM_NAME = "python311-subprocess-tee-0.4.1-4.1.noarch.rpm"
RPM_HASH = "9b228314773c6b63fb514d062b7ac52c983b78d5b754b73ef940b3e6b890f477730a8891aca45ac9fef0730dbaf6ee8495b16035d4906b09a08e15e959316533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(subprocess-tee) \
python311-subprocess-tee \
python3dist(subprocess-tee)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
