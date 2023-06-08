SUMMARY = "Tool providing a multi-cloud K8s single pane of glass"
DESCRIPTION = "Kubescape is a K8s open-source tool providing a multi-cloud K8s single pane of glass, including risk analysis, security compliance, RBAC visualizer and image vulnerabilities scanning. Kubescape scans K8s clusters, YAML files, and HELM charts, detecting misconfigurations according to multiple frameworks (such as the NSA-CISA , MITRE ATT&CK®), software vulnerabilities, and RBAC (role-based-access-control) violations at early stages of the CI/CD pipeline, calculates risk score instantly and shows risk trends over time. It became one of the fastest-growing Kubernetes tools among developers due to its easy-to-use CLI interface, flexible output formats, and automated scanning capabilities, saving Kubernetes users and admins’ precious time, effort, and resources. Kubescape integrates natively with other DevOps tools, including Jenkins, CircleCI, Github workflows, Prometheus, and Slack, and supports multi-cloud K8s deployments like EKS, GKE, and AKS."
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "kubescape-2.3.1-1.1.aarch64.rpm"
RPM_HASH = "0145376fbea77e8cc9e079ea7ff9295d28dc0f035d53a8c7d28a9fbf7f3a4efc00c81734eda81ba637f39fecc53c1933eac1d149e9a5228d165fbc39b9fc7f63"

RPROVIDES:${PN} += "kubescape kubescape(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
