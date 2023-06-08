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

RPM_NAME = "python39-subprocess-tee-0.4.1-3.1.noarch.rpm"
RPM_HASH = "b00c3da015dc404c54fa910b10bb5b57b924de8d1620f4376fb83cb0e03c461343ae6a2d1a280c366adad4e0a460b663cd3a708ba1e4c473f728b474627fad21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(subprocess-tee) python39-subprocess-tee python3dist(subprocess-tee)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
