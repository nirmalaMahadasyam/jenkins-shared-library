// this code is for 78s
static final String region(){
    return "us-east-1"
}
static final String nexusURL(){
    return "nexus.daws78s.online:8081"
}
static final String account_id(){
    return "315069654700"
}
// this code is for 81s

def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "315069654700"
        case 'qa':
            return "315069654700"
        case 'uat':
            return "315069654700"
        case 'pre-prod':
            return "315069654700"
        case 'prod':
            return "315069654700"
        default:
            return "nothing"
    } 
}
