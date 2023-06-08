SUMMARY = "CLI tool for Atlassian JIRA inspired by the Github CLI tool"
DESCRIPTION = "JiraCLI is an interactive command line tool for Atlassian Jira that will help \
you avoid Jira UI to some extent. This tool is not yet considered complete but \
has all the essential features required to improve your workflow with Jira. The \
tool started with the idea of making issue search and navigation as \
straightforward as possible. The tool now includes all necessary features like \
issue creation, cloning, linking, ticket transition, and much more. The TUI is \
heavily inspired by the GitHub CLI."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "jira-cli-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "eb5bbce47274835fa973c2aa3f772aaabcb5b3c17ed67fe2a28d9a35ab076ca1ec6b5596ec24bead48fce9df82632dd3d0e3719806a1c3346dd60dff0c9c4ad8"

RPROVIDES:${PN} += "jira-cli jira-cli(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
