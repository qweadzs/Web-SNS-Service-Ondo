import useUser from "../store/hooks/userHooks"
import AppLayout from '../components/layout/AppLayout'


export default function Test() {
    const {plus, count} = useUser()
    return (
        <AppLayout>

        <div>
            <h1>count</h1>
            <button onClick={() => plus()}> + </button>
            <p> 값: {count}</p>

        </div>
        </AppLayout>
    )
}