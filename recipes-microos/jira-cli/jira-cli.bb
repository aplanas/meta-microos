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

RPM_NAME = "jira-cli-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "11bee85a174a5d232acfcb9b88dfd54857e83f9c5e88db5b79a35fb01e5b8a11c1fe86258de6fabc3b7a5177f60c2f860cbe42173f8c4c6d9be8b619ed0978c2"

RPROVIDES:${PN} += "jira-cli jira-cli(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
